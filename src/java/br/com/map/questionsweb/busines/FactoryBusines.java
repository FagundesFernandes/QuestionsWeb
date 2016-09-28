/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.map.questionsweb.busines;

import br.com.map.questionsweb.facade.Facade;
import br.com.map.questionsweb.model.Professor;

/**
 *
 * @author fagundes
 */
public class FactoryBusines {
    
    private static ProfessorBusines professorBusines = null;
    
    public static ProfessorBusines getProfessorBusiness() {

        if (professorBusines == null) {
            professorBusines = new ProfessorBusines();
        }
        return professorBusines;
    }
 
}
