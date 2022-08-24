package br.com.store.request;

import br.com.store.budget.Budget;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GenerateOrder {

    private String client;
    private BigDecimal budgetValue;
    private int quantity;

    public GenerateOrder(String client, BigDecimal budgetValue, int quantity) {
        this.client = client;
        this.budgetValue = budgetValue;
        this.quantity = quantity;
    }

    public String getClient() {
        return client;
    }

    public BigDecimal getBudgetValue() {
        return budgetValue;
    }

    public int getQuantity() {
        return quantity;
    }
}
