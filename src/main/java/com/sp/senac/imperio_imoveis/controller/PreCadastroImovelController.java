package com.sp.senac.imperio_imoveis.controller;

import com.sp.senac.imperio_imoveis.DAO.InvestidorDAO;
import com.sp.senac.imperio_imoveis.DAO.PreCadastroImoveisDAO;
import com.sp.senac.imperio_imoveis.model.InvestidorEntity;
import com.sp.senac.imperio_imoveis.model.PreCadastroImovelEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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
    public ModelAndView cadastrarPreCadastroImovel (@ModelAttribute PreCadastroImovelEntity preCadastroImovel) {
        dao.save(preCadastroImovel);
        return paginaListarPreCadastroImovel();
    }

    @GetMapping("/listar_pre_cadastro_imovel")
    public ModelAndView paginaListarPreCadastroImovel() {
        List<PreCadastroImovelEntity> lista = dao.findAll();
        ModelAndView mv = new ModelAndView("listar_pre_cadastro_imovel");
        mv.addObject("lpci", lista );
        return mv;
    }

    @GetMapping("/excluir_pre_cadastro_imovel/{id}")
    public ModelAndView excluir(@PathVariable int id) {
        dao.deleteById(id);
        return paginaListarPreCadastroImovel();
    }

    @GetMapping("editar_pre_cadastro_imovel/{id}")
    public ModelAndView editar(@PathVariable int id) {
        PreCadastroImovelEntity preCadastroImovelEntity = dao.findById(id).get();
        return preCadastroImovel(preCadastroImovelEntity);
    }

}
