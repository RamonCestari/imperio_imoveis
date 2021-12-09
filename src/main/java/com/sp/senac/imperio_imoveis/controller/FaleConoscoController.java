package com.sp.senac.imperio_imoveis.controller;

import com.sp.senac.imperio_imoveis.DAO.FaleConoscoDAO;
import com.sp.senac.imperio_imoveis.DAO.PreCadastroImoveisDAO;
import com.sp.senac.imperio_imoveis.model.FaleConoscoEntity;
import com.sp.senac.imperio_imoveis.model.PreCadastroImovelEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FaleConoscoController {

    @GetMapping("/fale_conosco")
    public ModelAndView cadastroFaleConosco(FaleConoscoEntity cadastroFaleConosco) {
        ModelAndView mv = new ModelAndView("fale_conosco");
        mv.addObject("fcn", cadastroFaleConosco);
        return mv;
    }

    @Autowired
    private FaleConoscoDAO dao;

    @PostMapping ("/fale_conosco")
    public ModelAndView faleConosco (@ModelAttribute FaleConoscoEntity faleConosco) {
        dao.save(faleConosco);
        return cadastroFaleConosco(faleConosco);
    }

}
