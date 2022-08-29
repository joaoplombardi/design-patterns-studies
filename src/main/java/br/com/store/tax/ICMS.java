package br.com.store.tax;

import br.com.store.budget.Budget;

import java.math.BigDecimal;

public class ICMS extends Tax {

    public ICMS(Tax other) {
        super(other);
    }

    @Override
    public BigDecimal performCalculation(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }

}
