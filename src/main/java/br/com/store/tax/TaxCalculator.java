package br.com.store.tax;

import br.com.store.budget.Budget;

import java.math.BigDecimal;

public class TaxCalculator {

    public BigDecimal calculate(Budget budget, Tax tax){
        return tax.calculate(budget);
    }

}
