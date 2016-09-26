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
public class Curso {
    
    private long id;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Questoes> questoes;
    private  ArrayList<Aluno> alunos;
    private ArrayList<Prova> provas;
    
    public Curso(){
        
    }
    
    public Curso(long id, ArrayList<Disciplina> disciplinas, ArrayList<Questoes> questoes, ArrayList<Aluno> alunos, ArrayList<Prova> provas){
        
        this.id = id;
        this.alunos = alunos;
        this.disciplinas = disciplinas;
        this.provas = provas;
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
     * @return the disciplinas
     */
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    /**
     * @param disciplinas the disciplinas to set
     */
    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
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
     * @return the provas
     */
    public ArrayList<Prova> getProvas() {
        return provas;
    }

    /**
     * @param provas the provas to set
     */
    public void setProvas(ArrayList<Prova> provas) {
        this.provas = provas;
    }
    
    
    
}
