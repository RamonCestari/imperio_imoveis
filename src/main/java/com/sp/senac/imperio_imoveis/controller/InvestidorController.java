package com.sp.senac.imperio_imoveis.controller;

import com.sp.senac.imperio_imoveis.DAO.InvestidorDAO;
import com.sp.senac.imperio_imoveis.model.InvestidorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InvestidorController {

    @GetMapping("/cadastro_investidor")
    public ModelAndView cadastrarInvestidor(InvestidorEntity investidor){
        ModelAndView mv = new ModelAndView("cadastro_investidor");
        mv.addObject("ci",investidor);
        return mv;
    }
    //@Autowired

    public InvestidorDAO dao;

    @PostMapping("/salvar_cadastro_investidor")
    public String cadastroInvestidor (@ModelAttribute InvestidorEntity cadastroInvestidor){
       // dao.save(cadastroInvestidor);
        return "index";
    }

}
