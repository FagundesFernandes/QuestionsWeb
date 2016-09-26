/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.map.questionsweb.dao;

import java.util.List;

/**
 *
 * @author fagundes
 */
public interface IDaoGenerico<T> {
 
    void save(T o);

     T getObject(Long id);

     List<T> getAll();

     void remove(T o);

     void update(T o);
    
}
