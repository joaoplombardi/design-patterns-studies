package br.com.store.tax;

import br.com.store.budget.Budget;

import java.math.BigDecimal;

public interface Tax {

    public BigDecimal calculate(Budget budget);

}
