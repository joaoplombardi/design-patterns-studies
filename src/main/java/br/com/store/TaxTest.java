package br.com.store;

import br.com.store.budget.Budget;
import br.com.store.tax.ICMS;
import br.com.store.tax.ISS;
import br.com.store.tax.TaxCalculator;

import java.math.BigDecimal;

public class TaxTest {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"), 1);
        TaxCalculator calculator = new TaxCalculator();

        System.out.println(calculator.calculate(budget, new ISS(new ICMS(null))));

    }
}
