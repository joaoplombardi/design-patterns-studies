package br.com.store.discounts;

import br.com.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountCalculator {

    public BigDecimal calculate(Budget budget){
        Discount chainOfDiscount = new DiscountForBudgetWithMoreThanFiveItems(
                new DiscountForBudgetWithAValueGreaterThanFiveHundred(
                        new WithoutDiscount()
                )
        );

        return chainOfDiscount.performCalculation(budget);
    }

}
