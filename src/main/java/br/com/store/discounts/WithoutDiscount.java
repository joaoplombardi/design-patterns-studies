package br.com.store.discounts;

import br.com.store.budget.Budget;

import java.math.BigDecimal;

public class WithoutDiscount extends Discount {

    public WithoutDiscount() {
        super(null);
    }

    @Override
    public BigDecimal performCalculation(Budget budget){
        return BigDecimal.ZERO;
    }

    @Override
    public boolean mustApply(Budget budget) {
        return true;
    }

}
