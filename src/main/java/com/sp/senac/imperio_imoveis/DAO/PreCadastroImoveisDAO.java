package com.sp.senac.imperio_imoveis.DAO;

import com.sp.senac.imperio_imoveis.model.PreCadastroImovelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreCadastroImoveisDAO extends JpaRepository<PreCadastroImovelEntity,Integer > {
}
