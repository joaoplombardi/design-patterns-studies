package br.com.store.discounts;

import br.com.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountForBudgetWithAValueGreaterThanFiveHundred extends Discount {

    public DiscountForBudgetWithAValueGreaterThanFiveHundred(Discount next) {
        super(next);
    }

    @Override
    public BigDecimal performCalculation(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean mustApply(Budget budget) {
        return budget.getItensQuantity() > 5;
    }

}
