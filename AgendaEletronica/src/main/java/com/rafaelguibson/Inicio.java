package com.rafaelguibson;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;

public class Inicio extends WebPage {
    
    public Inicio() {
        Label labelMensagemBoasVindas = new Label("mensagemBoasVindas", Model.of("Bem vindo à agenda Eletrônica!"));
        add(labelMensagemBoasVindas);
    }
}
