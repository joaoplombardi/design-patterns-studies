package br.com.store.request;

import br.com.store.budget.Budget;

import java.time.LocalDateTime;

public class Request {

    private String client;
    private LocalDateTime date;
    private Budget budget;

    public Request(String client, LocalDateTime date, Budget budget) {
        this.client = client;
        this.date = date;
        this.budget = budget;
    }

    public String getClient() {
        return client;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Budget getBudget() {
        return budget;
    }
}
