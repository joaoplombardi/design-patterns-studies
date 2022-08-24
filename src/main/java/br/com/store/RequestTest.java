package br.com.store;

import br.com.store.request.GenerateOrder;
import br.com.store.request.GenerateOrderHandler;

import java.math.BigDecimal;

public class RequestTest {

    public static void main(String[] args) {
        String client = args[0];
        BigDecimal budgetValue = new BigDecimal(args[1]);
        int quantity = Integer.parseInt(args[2]);

        GenerateOrder generator = new GenerateOrder(client, budgetValue, quantity);
        GenerateOrderHandler handler = new GenerateOrderHandler(/*dependências*/);
        handler.execute(generator);
    }

}
