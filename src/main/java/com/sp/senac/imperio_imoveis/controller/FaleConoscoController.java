package com.sp.senac.imperio_imoveis.controller;

import com.sp.senac.imperio_imoveis.model.FaleConoscoEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class FaleConoscoController {

    @GetMapping("/fale_conosco")
    public ModelAndView paginaFaleConosoco(FaleConoscoEntity faleConoscoEntity) {
        ModelAndView mv = new ModelAndView("fale_conosco");
        mv.addObject("fc", faleConoscoEntity);
        return mv;
    }
}
