package br.com.store.discounts;

import br.com.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountForBudgetWithMoreThanFiveItems extends Discount {

    public DiscountForBudgetWithMoreThanFiveItems(Discount next) {
        super(next);
    }

    public BigDecimal calculate(Budget budget){
        if (budget.getValue().compareTo(new BigDecimal("500")) > 0){
            return budget.getValue().multiply(new BigDecimal("0.05"));
        }
        return next.calculate(budget);
    }

}
