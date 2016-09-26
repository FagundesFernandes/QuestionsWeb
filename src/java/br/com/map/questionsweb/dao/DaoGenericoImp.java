/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.map.questionsweb.dao;

import br.com.map.questionsweb.util.PersistenceUtil;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;


/**
 *
 * @author fagundes
 */
public class DaoGenericoImp<T> implements IDaoGenerico<T> {

    private Class classe;
    
    public DaoGenericoImp(){
        this.classe = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }
    
    @Override
    public void save(T o) {
        EntityManager manager = PersistenceUtil.getEntityManager();
        try {
            manager.getTransaction().begin();
            manager.persist(o);
            manager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            //manager.getTransaction().rollback();
        } finally {
            manager.close();
        }
    }

    @Override
    public T getObject(Long id) {
        EntityManager manager = PersistenceUtil.getEntityManager();
        return (T) manager.find(classe, id);
    }

    @Override
    public List<T> getAll() {
       
        Criteria criteria = getCriteria();
        criteria.addOrder(Order.asc("id"));
        return criteria.list();
    }

    @Override
    public void remove(T o) {
        EntityManager manager = PersistenceUtil.getEntityManager();
        try {
            manager.getTransaction().begin();
            manager.remove(o);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        } finally {
            manager.close();
        }
    }

    @Override
    public void update(T o) {
        EntityManager manager = PersistenceUtil.getEntityManager();
        try {
            manager.getTransaction().begin();
            manager.merge(o);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        } finally {
            manager.close();
        }
    }
    
   
    
    public Criteria getCriteria(){
        EntityManager manager = PersistenceUtil.getEntityManager();
        try{
            return ((Session) manager.getDelegate()).createCriteria(classe);
        } catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    
}
