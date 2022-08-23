package br.com.store.discounts;

import br.com.store.budget.Budget;

import java.math.BigDecimal;

public class WithoutDiscount extends Discount {

    public WithoutDiscount() {
        super(null);
    }

    @Override
    public BigDecimal calculate(Budget budget){
        return BigDecimal.ZERO;
    }

}
