package com.caionunes.arquiteturaspring.todos;

import org.springframework.stereotype.Component;

@Component
public class MailSender {

    public void enviar(String mensagem){
        System.out.printf("Enviado email: " + mensagem);
    }

}
