/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.map.questionsweb.busines;

import br.com.map.questionsweb.dao.ProfessorDaoImp;
import br.com.map.questionsweb.model.Professor;

/**
 *
 * @author fagundes
 */
public class ProfessorBusines {
    
    ProfessorDaoImp professorDao;
    
    
    
   public ProfessorBusines(){
       
       professorDao = new ProfessorDaoImp();
   }

    

    

    public ProfessorDaoImp getProfessorDao() {
        return professorDao;
    }
    
     public void save(Professor professor){
        professorDao.save(professor);
    }
     
     public void remove(Professor professor){
        professorDao.update(professor);
    }
    
    public void update(Professor professor){
        professorDao.update(professor);
    }
    
}
