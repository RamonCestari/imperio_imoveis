package com.sp.senac.imperio_imoveis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PreCadastroImovelController {

    @GetMapping("/pre_cadastro_imovel")
    public String preCadastroImovel(){
        return "pre_cadastro_imovel";
    }
}
