package br.com.store.discounts;

import br.com.store.budget.Budget;

import java.math.BigDecimal;

public abstract class Discount {

    protected Discount next;

    public Discount(Discount next) {
        this.next = next;
    }

    public abstract BigDecimal calculate(Budget budget);



}
