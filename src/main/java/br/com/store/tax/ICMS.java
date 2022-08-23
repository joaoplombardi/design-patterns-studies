package br.com.store.tax;

import br.com.store.budget.Budget;

import java.math.BigDecimal;

public class ICMS implements Tax {

    @Override
    public BigDecimal calculate(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }

}