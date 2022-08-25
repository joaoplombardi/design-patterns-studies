package br.com.store.request.actions;

import br.com.store.request.Request;

public class EmailSender implements ActionAfterOrder {

    public void execute(Request request){
        System.out.println("Enviando e-mail com dados do pedido");
    }

}
