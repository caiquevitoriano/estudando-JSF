/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.meuprimeirojsf;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author caique
 */
@ManagedBean( name = "pessoaBean")
public class PessoaBean {
    
    private String nome;
    private String sobrenome;
    private String nomeCompleto;
    
    public String montarNome(){
        nomeCompleto = nome+" "+sobrenome;
        return "";
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    
    
           

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    
    
}
