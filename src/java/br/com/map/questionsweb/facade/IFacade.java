/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.map.questionsweb.facade;

import br.com.map.questionsweb.model.Professor;
import java.util.List;

/**
 *
 * @author fagundes
 */
public interface IFacade {
   
    public void savarProfessor(Professor p);
    
    public void editarProfessor(Professor p);
    
    public void excluirProfessor(Professor p);
    
    
    
}
