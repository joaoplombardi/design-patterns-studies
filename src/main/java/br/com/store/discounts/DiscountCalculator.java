package br.com.store.discounts;

import br.com.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountCalculator {

    public BigDecimal calculate(Budget budget){
        Discount discount = new DiscountForBudgetWithMoreThanFiveItems(
                new DiscountForBudgetWithMoreThanFiveItems(
                        new WithoutDiscount()
                )
        );

        return discount.calculate(budget);
    }

}
