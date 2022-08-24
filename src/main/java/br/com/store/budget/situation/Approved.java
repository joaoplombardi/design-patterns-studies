package br.com.store.budget.situation;

import br.com.store.budget.Budget;

import java.math.BigDecimal;

public class Approved extends BudgetSituation {

    public BigDecimal calculateExtraDiscountAmount(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finish(Budget budget) {
        budget.setSituation(new Finished());
    }
}
