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
public class Questoes {
    
    private long id;
    private String assunto;
    private String descricao;
    private String resposta;
    private Dificuldade dificuldade;
    private int qtdAlternativa;
    private Curso curso;
    private Disciplina disciplina;
    private ArrayList<Alternativa> alternativa;
    private Prova prova;

    
    public Questoes (){
    
    }

    public Questoes(long id, String assunto, String descricao, String resposta, Dificuldade dificuldade, int qtdAlternativa, Curso curso, Disciplina disciplina, ArrayList<Alternativa> alternativa, Prova prova) {
        this.id = id;
        this.assunto = assunto;
        this.descricao = descricao;
        this.resposta = resposta;
        this.dificuldade = dificuldade;
        this.qtdAlternativa = qtdAlternativa;
        this.curso = curso;
        this.disciplina = disciplina;
        this.alternativa = alternativa;
        this.prova = prova;

    
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public Dificuldade getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(Dificuldade dificuldade) {
        this.dificuldade = dificuldade;
    }

    public int getQtdAlternativa() {
        return qtdAlternativa;
    }

    public void setQtdAlternativa(int qtdAlternativa) {
        this.qtdAlternativa = qtdAlternativa;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<Alternativa> getAlternativa() {
        return alternativa;
    }

    public void setAlternativa(ArrayList<Alternativa> alternativa) {
        this.alternativa = alternativa;
    }

    public Prova getProva() {
        return prova;
    }

    public void setProva(Prova prova) {
        this.prova = prova;
    }
    
    
    
    
    
    
}

