package br.com.store.budget;

import br.com.store.exceptions.DomainException;
import br.com.store.http.HttpAdapter;

import java.util.Map;

public class BudgetRecord {

    private HttpAdapter http;

    public BudgetRecord(HttpAdapter http) {
        this.http = http;
    }

    public void register(Budget budget){
        if (!budget.isFinished()){
            throw new DomainException("Budget not finalized");
        }

        String url = "http://external.api/v1/budget";

        Map<String, Object> params = Map.of(
          "value", budget.getValue(),
          "quantity", budget.getItensQuantity()
        );

        http.post(url, params);
    }

}
