package com.sp.senac.imperio_imoveis.controller;

import com.sp.senac.imperio_imoveis.DAO.InvestidorDAO;
import com.sp.senac.imperio_imoveis.DAO.PreCadastroImoveisDAO;
import com.sp.senac.imperio_imoveis.model.InvestidorEntity;
import com.sp.senac.imperio_imoveis.model.PreCadastroImovelEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PreCadastroImovelController {


    @GetMapping("/pre_cadastro_imovel")
    public ModelAndView preCadastroImovel(PreCadastroImovelEntity preCadastroImovel) {
        ModelAndView mv = new ModelAndView("pre_cadastro_imovel");
        mv.addObject("pci", preCadastroImovel);
        return mv;
    }

    @Autowired
    private PreCadastroImoveisDAO dao;

    @PostMapping("/cadastrar_pre_cadastro_imovel")
    public String cadastrarPreCadastroImovel (@ModelAttribute PreCadastroImovelEntity preCadastroImovel) {
        dao.save(preCadastroImovel);
        return "index";
    }

    @GetMapping("/listar_pre_cadastro_imovel")
    public String paginaListarPreCadastroImovel(){
        return "listar_pre_cadastro_imovel";
    }

}
