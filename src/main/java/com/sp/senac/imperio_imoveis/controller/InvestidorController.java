package com.sp.senac.imperio_imoveis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvestidorController {

    @GetMapping("/cadastro_investidor")
    public String cadastroInvestidor(){
        return "cadastro_investidor";
    }


}
