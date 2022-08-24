package br.com.store.discounts;

import br.com.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountForBudgetWithAValueGreaterThanFiveHundred extends Discount {

    public DiscountForBudgetWithAValueGreaterThanFiveHundred(Discount next) {
        super(next);
    }

    @Override
    public BigDecimal calculate(Budget budget){
        if (budget.getItensQuantity() > 5){
            return budget.getValue().multiply(new BigDecimal("0.1"));
        }
        return next.calculate(budget);
    }

}
