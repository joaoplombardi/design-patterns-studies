package br.com.store.tax;

import br.com.store.budget.Budget;

import java.math.BigDecimal;

public abstract class Tax {

    private Tax other;

    protected Tax(Tax other) {
        this.other = other;
    }

    protected abstract BigDecimal performCalculation(Budget budget);

    public BigDecimal calculate(Budget budget){
        BigDecimal taxValue = performCalculation(budget);
        BigDecimal otherTaxValue = BigDecimal.ZERO;

        if (other != null){
            otherTaxValue = other.performCalculation(budget);
        }

        return taxValue.add(otherTaxValue);
    }

}
