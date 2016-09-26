/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.map.questionsweb.model;

import java.util.ArrayList;

/**
 *
 * @author fagundes
 */
public class Prova {
    
    private long id;
    private String descricao;
    private ArrayList<Questoes> questoes;
    private ArrayList<Aluno> alunos;
    private Curso curso;
    
    public Prova(){
        
    }
    
    public Prova(long id, String descricao, ArrayList<Questoes> questoes, ArrayList<Aluno> alunos, Curso curso){
        
        this.id = id;
        this.descricao = descricao;
        this.alunos = alunos;
        this.questoes = questoes;
        this.curso = curso;
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
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the questoes
     */
    public ArrayList<Questoes> getQuestoes() {
        return questoes;
    }

    /**
     * @param questoes the questoes to set
     */
    public void setQuestoes(ArrayList<Questoes> questoes) {
        this.questoes = questoes;
    }

    /**
     * @return the alunos
     */
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    /**
     * @param alunos the alunos to set
     */
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    /**
     * @return the curso
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    
}
