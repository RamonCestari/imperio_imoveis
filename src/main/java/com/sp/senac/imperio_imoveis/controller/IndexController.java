package com.sp.senac.imperio_imoveis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/home")
    public String paginaInicial(){
            return "index";
        }

    @GetMapping("/sobre_nos")
    public String paginaSobreNos(){
            return "sobre_nos";
        }

    @GetMapping("/financie")
    public String paginaFinancie(){
        return "financie";
    }

    @GetMapping("/fale_conosco")
    public String paginaFaleConosco(){
        return "fale_conosco";
    }


}
