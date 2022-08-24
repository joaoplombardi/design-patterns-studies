package br.com.store;

import br.com.store.budget.Budget;
import br.com.store.discounts.DiscountCalculator;
import br.com.store.tax.ICMS;
import br.com.store.tax.TaxCalculator;

import java.math.BigDecimal;

public class DiscountTest {
    public static void main(String[] args) {
        Budget first = new Budget(new BigDecimal("200"), 6);
        Budget second = new Budget(new BigDecimal("1000"), 2);
        Budget third = new Budget(new BigDecimal("500"), 1);

        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println(calculator.calculate(first));
        System.out.println(calculator.calculate(second));
        System.out.println(calculator.calculate(third));
    }
}
