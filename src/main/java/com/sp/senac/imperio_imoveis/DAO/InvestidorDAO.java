package com.sp.senac.imperio_imoveis.DAO;

import com.sp.senac.imperio_imoveis.model.InvestidorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestidorDAO extends JpaRepository<InvestidorEntity, Integer>{
}
