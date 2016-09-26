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
public class Disciplina {
    
    private long id;
    private int periodo;
    private String nome;
    private ArrayList<Professor> professores;
    private ArrayList<Questoes> questoes;
    private Curso curso;
    
    public Disciplina(){
        
    }
    
    public Disciplina(long id, int periodo,String nome, ArrayList<Professor> professores, ArrayList<Questoes> questoes, Curso curso){
    
        this.id = id;
        this.curso = curso;
        this.nome = nome;
        this.periodo = periodo;
        this.professores = professores;
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
     * @return the periodo
     */
    public int getPeriodo() {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
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
