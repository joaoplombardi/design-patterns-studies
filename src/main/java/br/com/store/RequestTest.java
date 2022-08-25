package br.com.store;

import br.com.store.request.GenerateOrder;
import br.com.store.request.GenerateOrderHandler;
import br.com.store.request.actions.EmailSender;
import br.com.store.request.actions.SaveOrderInDatabase;

import java.math.BigDecimal;
import java.util.Arrays;

public class RequestTest {

    public static void main(String[] args) {
        String client = "Joao";
        BigDecimal budgetValue = new BigDecimal("300");
        int quantity = Integer.parseInt("2");

        GenerateOrder generator = new GenerateOrder(client, budgetValue, quantity);
        GenerateOrderHandler handler = new GenerateOrderHandler(
                Arrays.asList(
                        new SaveOrderInDatabase(),
                        new EmailSender()
                )
        );
        handler.execute(generator);
    }

}
