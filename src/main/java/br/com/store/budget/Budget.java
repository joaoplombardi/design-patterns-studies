package br.com.store.budget;

import java.math.BigDecimal;

public class Budget {

    private BigDecimal value;
    private int itensQuantity;

    public Budget(BigDecimal value, int itensQuantity) {
        this.value = value;
        this.itensQuantity = itensQuantity;
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getItensQuantity() {
        return itensQuantity;
    }
}
