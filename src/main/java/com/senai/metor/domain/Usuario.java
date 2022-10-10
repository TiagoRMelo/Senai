package com.senai.metor.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Usuario implements Serializable {
   
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer  idusuario;
    private String nomeCompleto;
    private String cpf;
    private String email;
    private String telefone;
    private String senha;
    private char genero;
    public Usuario(Integer idusuario, String nomeCompleto, String cpf, String email, String telefone, String senha,
            char genero) {
        this.idusuario = idusuario;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        this.genero = genero;
    }
    public Usuario() {
    }
    public Integer getIdusuario() {
        return idusuario;
    }
    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }

}
