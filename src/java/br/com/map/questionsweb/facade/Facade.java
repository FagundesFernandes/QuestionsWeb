/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.map.questionsweb.facade;

import br.com.map.questionsweb.busines.FactoryBusines;
import br.com.map.questionsweb.model.Professor;

/**
 *
 * @author fagundes
 */
public class Facade implements IFacade{

    @Override
    public void savarProfessor(Professor p) {
        FactoryBusines.getProfessorBusiness().save(p);
    }

    @Override
    public void editarProfessor(Professor p) {
        FactoryBusines.getProfessorBusiness().update(p);
    }

    @Override
    public void excluirProfessor(Professor p) {
        FactoryBusines.getProfessorBusiness().remove(p);
    }
    
}
