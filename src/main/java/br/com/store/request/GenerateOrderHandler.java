package br.com.store.request;

import br.com.store.budget.Budget;
import br.com.store.request.actions.ActionAfterOrder;

import java.time.LocalDateTime;
import java.util.List;

public class GenerateOrderHandler {

    private List<ActionAfterOrder> actions;

    public GenerateOrderHandler(List<ActionAfterOrder> actions) {
        this.actions = actions;
    }

    public void execute(GenerateOrder data){
        Request request = new Request(
                data.getClient(),
                LocalDateTime.now(),
                new Budget(
                        data.getBudgetValue(),
                        data.getQuantity()
                )
        );

        actions.forEach(action -> action.execute(request));
    }

}
