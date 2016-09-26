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
public class Alternativa {
    
    private long id;
    private String desricao;
    private char alternativa;
    private Questoes questoes;
    
    
    public Alternativa(){
        
    }
    
    public Alternativa(long id, String descricao, char alternativa, Questoes questoes){
        this.id = id;;
        this.desricao = descricao;
        this.alternativa = alternativa;
        this.questoes = questoes;
        
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
     * @return the desricao
     */
    public String getDesricao() {
        return desricao;
    }

    /**
     * @param desricao the desricao to set
     */
    public void setDesricao(String desricao) {
        this.desricao = desricao;
    }

    /**
     * @return the alternativa
     */
    public char getAlternativa() {
        return alternativa;
    }

    /**
     * @param alternativa the alternativa to set
     */
    public void setAlternativa(char alternativa) {
        this.alternativa = alternativa;
    }

    /**
     * @return the questoes
     */
    public Questoes getQuestoes() {
        return questoes;
    }

    /**
     * @param questoes the questoes to set
     */
    public void setQuestoes(Questoes questoes) {
        this.questoes = questoes;
    }
    
}
