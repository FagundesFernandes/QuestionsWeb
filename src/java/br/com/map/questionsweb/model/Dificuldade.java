/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.map.questionsweb.model;

/**
 *
 * @author fagundes
 */
public enum Dificuldade {
    
    FACIL("FÁCIL"),
    MEDIO("MÉDIO"),
    DIFICIL("DIFÍCIL");
    
    String nivel;
    
    private Dificuldade(String nivel){
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }
    
}
