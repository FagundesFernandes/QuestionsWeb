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
public class Aluno {
    
    private long id;
    private String nome;
    private int matricula;
    private ArrayList<Curso> cursos;
    private ArrayList<Prova> provas;
    
    public Aluno(){
        
    }
    
    public Aluno(long id, String nome, int matricula, ArrayList<Curso> cursos, ArrayList<Prova> provas){
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.cursos = cursos;
        this.provas = provas;
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
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the cursos
     */
    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    /**
     * @param cursos the cursos to set
     */
    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
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
