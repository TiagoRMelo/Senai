package com.senai.metor.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.senai.metor.domain.Estacao;

@Repository
public interface EstacaoRespository extends JpaRepository<Estacao, Integer>  {

    @Query("SELECT max(e_objeto.id) from Estacao e_objeto")
    Integer getMaxIdEstacao();
    
}
