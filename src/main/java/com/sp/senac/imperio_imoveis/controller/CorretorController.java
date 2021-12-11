package com.sp.senac.imperio_imoveis.controller;

import com.sp.senac.imperio_imoveis.DAO.CorretorDAO;
import com.sp.senac.imperio_imoveis.model.CorretorEntity;
import com.sp.senac.imperio_imoveis.model.PreCadastroImovelEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CorretorController {

    @GetMapping("/cadastro_corretor")
    public ModelAndView cadastroCorretor(CorretorEntity cadastroCorretor) {
        ModelAndView mv = new ModelAndView("cadastro_corretor");
        mv.addObject("cr", cadastroCorretor);
        return mv;
    }

    @Autowired

    private CorretorDAO dao;

    @PostMapping("/cadastrar_corretor")
    public ModelAndView cadastrarCorretor (@ModelAttribute CorretorEntity cadastroCorretor) {
        dao.save(cadastroCorretor);
        return listarCorretores();
    }

    @GetMapping("/listar_cadastro_corretor")
    public ModelAndView listarCorretores() {
        List<CorretorEntity> lista = dao.findAll();
        ModelAndView mv = new ModelAndView("listar_corretores");
        mv.addObject("corretores", lista );
        return mv;
    }

    @GetMapping("/excluir_cadastro_corretor/{id}")
    public ModelAndView excluir(@PathVariable int id) {
        dao.deleteById(id);
        return listarCorretores();
    }

    @GetMapping("editar_cadastro_corretor/{id}")
    public ModelAndView editar(@PathVariable int id) {
        CorretorEntity cadastroCorretor = dao.findById(id).get();
        return cadastroCorretor(cadastroCorretor);
    }
}
