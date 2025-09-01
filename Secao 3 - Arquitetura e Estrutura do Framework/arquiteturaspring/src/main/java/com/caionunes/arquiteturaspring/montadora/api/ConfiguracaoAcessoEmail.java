package com.caionunes.arquiteturaspring.montadora.api;

import com.caionunes.arquiteturaspring.AppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguracaoAcessoEmail {

    @Autowired
    private AppProperties properties;

   // @Bean
    public String MailSender(){
        return null;
    }

}
