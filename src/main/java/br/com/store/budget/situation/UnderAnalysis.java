package br.com.store.budget.situation;

import br.com.store.budget.Budget;

import java.math.BigDecimal;

public class UnderAnalysis extends BudgetSituation {

    public BigDecimal calculateExtraDiscountAmount(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void approve(Budget budget){
        budget.setSituation(new Approved());
    }

    @Override
    public void refuse(Budget budget){
        budget.setSituation(new Refused());
    }

}
