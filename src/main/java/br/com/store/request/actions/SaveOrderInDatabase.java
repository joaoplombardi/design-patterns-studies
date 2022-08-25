package br.com.store.request.actions;

import br.com.store.request.Request;

public class SaveOrderInDatabase implements ActionAfterOrder{

    public void execute(Request request){
        System.out.println("Salvando pedidos no banco de dados");
    }

}
