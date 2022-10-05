package com.senai.metor.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
public class Estacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer  idestacao;
    
    @NotEmpty(message = "Campo nmEstacao Não pode estar vazio  ")
    @Length(min = 1,max = 20, message = "Campo nmEstacao  deve ter rentre 5 e 255 caracter")
    private String nmestacao;
    
    @NotEmpty(message = "Campo localEstacao Não pode estar vazio  ")
    @Length(min = 1,max = 30, message = "Campo localEstacao  deve ter rentre 5 e 255 caracter")
    private String localestacao;
    
    @NotEmpty(message = "Campo nmResponsavel Não pode estar vazio  ")
    @Length(min = 1,max = 40, message = "Campo nmResponsavel  deve ter rentre 5 e 255 caracter")
    private String nmresponsavel;

    public Estacao() {
    }

   public Estacao(Integer idestacao, String nmestacao, String localestacao, String nmresponsavel) {
        setIdestacao(idestacao);
        setNmestacao(nmestacao);
        setLocalestacao(localestacao);
        setNmresponsavel(nmresponsavel);
    }

    public int getIdestacao() {
        return idestacao;
    }

    public void setIdestacao(int idestacao) {
        this.idestacao = idestacao;
    }

    public String getNmestacao() {
        return nmestacao;
    }

    public void setNmestacao(String nmestacao) {
        this.nmestacao = nmestacao;
    }

    public String getLocalestacao() {
        return localestacao;
    }

    public void setLocalestacao(String localestacao) {
        this.localestacao = localestacao;
    }

    public String getNmresponsavel() {
        return nmresponsavel;
    }

    public void setNmresponsavel(String nmresponsavel) {
        this.nmresponsavel = nmresponsavel;
    }
}
