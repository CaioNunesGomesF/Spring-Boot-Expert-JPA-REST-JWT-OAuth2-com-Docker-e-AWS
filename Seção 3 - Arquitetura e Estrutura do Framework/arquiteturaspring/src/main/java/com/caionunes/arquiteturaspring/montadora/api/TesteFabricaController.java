package com.caionunes.arquiteturaspring.montadora.api;

import com.caionunes.arquiteturaspring.montadora.Carro;
import com.caionunes.arquiteturaspring.montadora.Chave;
import com.caionunes.arquiteturaspring.montadora.HondaHRV;
import com.caionunes.arquiteturaspring.montadora.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    @Autowired
    @Eletrico
    @Qualifier("motorEletrico")
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave){
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);
    }

}
