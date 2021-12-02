package com.sp.senac.imperio_imoveis.controller;

import com.sp.senac.imperio_imoveis.DAO.ImagemPreCadastroImoveisDAO;
import com.sp.senac.imperio_imoveis.DAO.PreCadastroImoveisDAO;
import com.sp.senac.imperio_imoveis.model.ImagemPreCadastroImovelEntity;
import com.sp.senac.imperio_imoveis.model.PreCadastroImovelEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class ImagemPreCadastroImovelController {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private PreCadastroImoveisDAO preCadastroImoveisDAO;

    @Autowired
    private ImagemPreCadastroImoveisDAO imagemPreCadastroImoveisDAO;

    @GetMapping("/imagem_pre_cadastro_imovel/{idImovel}")
    public ModelAndView preCadastroImovel(@PathVariable int idImovel, ImagemPreCadastroImovelEntity imagemPreCadastroImovel) {
        ModelAndView mv = new ModelAndView("imagem_pre_cadastro_imovel");
        PreCadastroImovelEntity preCadastroImovel = preCadastroImoveisDAO.findById(idImovel).get();
        imagemPreCadastroImovel.setPreCadastroImovel(preCadastroImovel);
        mv.addObject("ipci", imagemPreCadastroImovel);
        return mv;
    }

    @PostMapping("/cadastrar_imagem_pre_cadastro_imovel")
    public String uploadImagemPreCadastroImovel(@RequestParam("file") MultipartFile multipartFile,@ModelAttribute ImagemPreCadastroImovelEntity imagemPreCadastroImovel) throws IOException {
        Path raiz = Paths.get("src/main/resources/imagens_imoveis/" + String.valueOf(imagemPreCadastroImovel.getPreCadastroImovel().getId()));

        Files.createDirectories(raiz);

        Files.copy(multipartFile.getInputStream(), raiz.resolve(multipartFile.getOriginalFilename()));

        imagemPreCadastroImovel.setImagem(raiz.toUri().getPath() + multipartFile.getOriginalFilename());

        imagemPreCadastroImoveisDAO.save(imagemPreCadastroImovel);
        return "index";
    }
}
