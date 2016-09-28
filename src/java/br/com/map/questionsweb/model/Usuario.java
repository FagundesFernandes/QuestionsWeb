/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.map.questionsweb.model;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author fagundes
 */
@Entity
public class Usuario {
    
    @Id
    private long id;
    private String login;
    private String senha;
    @OneToMany
    private ArrayList<Professor> professores;
    
    public Usuario(){
        
    }
    
    public Usuario(long id, String login, String senha, ArrayList<Professor> professores){
        
        this.id = id;
        this.login = login;
        this.senha = login;
        this.professores = professores;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the professores
     */
    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    /**
     * @param professores the professores to set
     */
    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }
    
    
}
