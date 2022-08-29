package br.com.store.tax;

import br.com.store.budget.Budget;

import java.math.BigDecimal;

public class ISS extends Tax {

    public ISS(Tax other) {
        super(other);
    }

    @Override
    public BigDecimal performCalculation(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.06"));
    }

}
