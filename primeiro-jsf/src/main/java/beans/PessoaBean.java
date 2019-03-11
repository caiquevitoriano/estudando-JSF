/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author caique
 */

@ManagedBean(name = "pessoaBean")
@ViewScoped
public class PessoaBean {
    
    private String nome;
    private List<String> nomes = new ArrayList<>();
    
    public String addNome(){
        nomes.add(nome);
        return "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getNomes() {
        return nomes;
    }

    public void setNomes(List<String> nomes) {
        this.nomes = nomes;
    }
    
    


    
    
}
