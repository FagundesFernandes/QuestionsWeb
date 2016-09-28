
import br.com.map.questionsweb.facade.Facade;
import br.com.map.questionsweb.model.Professor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fagundes
 */
public class Teste {
	
	
	public static void main(String[] args) {
		
		
                Facade f = new Facade();
                
                Professor p = new Professor();
                
                p.setNome("João");
                f.savarProfessor(p);
		
	}

}