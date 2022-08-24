package br.com.store.request;

import br.com.store.budget.Budget;

import java.time.LocalDateTime;

public class GenerateOrderHandler {

    //construtor com as injeções de dependências


    public void execute(GenerateOrder data){
        Request request = new Request(
                data.getClient(),
                LocalDateTime.now(),
                new Budget(
                        data.getBudgetValue(),
                        data.getQuantity()
                )
        );

        System.out.println("Salvar pedido no banco");

        System.out.println("Enviar e-mail com dados do novo pedido");
    }

}
