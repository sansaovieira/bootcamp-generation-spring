package com.generation.helloworld.listabsm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lista-bsm")
public class ListaController {

    @GetMapping
    public String listaBsm() {

        String[] bsmList = {
            "BSM-P - O que é Persistência?", 
            "BSM-OD - O que é orientação ao detalhe?", 
            "BSM-C - Video: Os Tipos de Comunicação", 
            "BSM-T - Redefinindo o Trabalho em Equipe", 
            "BSM-FO - Ter Orientação ao Futuro ", 
            "BSM-GM -Introdução às Mentalidades", 
            "BSM-PA - Por Que Ser Proativo"
        };

        return String.join("<br>", bsmList);
    }

}
