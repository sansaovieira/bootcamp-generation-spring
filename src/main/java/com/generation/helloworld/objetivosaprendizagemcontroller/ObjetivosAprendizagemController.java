package com.generation.helloworld.objetivosaprendizagemcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos-aprendizagem")

public class ObjetivosAprendizagemController {
    @GetMapping
    public String listaObjetivosAprendizagem() {

        String[] listaAprendizagem = {
            "Aprender todos os conceitos sobre Java", 
            "Aprender sobre OOP", 
            "Aprender Java avançado para certificação", 
            "Aprender sobre Spring, JPA e Hibertnet", 
            "Conseguir criar uma API com arquitetura limpa", 
            "Desenvolver camadas de microfrontend", 
            "Ter conhecimentos sobre processos de deploy"
        };

        return String.join("<br>", listaAprendizagem);
    }
}
