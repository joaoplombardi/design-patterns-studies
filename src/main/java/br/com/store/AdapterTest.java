package br.com.store;

import br.com.store.budget.Budget;
import br.com.store.budget.BudgetRecord;
import br.com.store.http.JavaHttpClient;

import java.math.BigDecimal;

public class AdapterTest {

    public static void main(String[] args) {
        Budget budget = new Budget(BigDecimal.TEN, 1);

        budget.approve();
        budget.finish();

        BudgetRecord budgetRecord = new BudgetRecord(new JavaHttpClient());
        budgetRecord.register(budget);
    }

}
