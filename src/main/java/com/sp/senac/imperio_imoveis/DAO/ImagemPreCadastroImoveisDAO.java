package com.sp.senac.imperio_imoveis.DAO;

import com.sp.senac.imperio_imoveis.model.ImagemPreCadastroImovelEntity;
import com.sp.senac.imperio_imoveis.model.PreCadastroImovelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImagemPreCadastroImoveisDAO extends JpaRepository<ImagemPreCadastroImovelEntity,Integer > {
}
