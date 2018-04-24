/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.repository;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Hafees
 */
public abstract class SuperRepositoryImpl<T,ID extends Serializable> implements SuperRepository<T, ID>{
    
    private Session session;
    private Class<T> entityClass;

    public SuperRepositoryImpl() {

        entityClass = (Class<T>) ((ParameterizedType)(this.getClass().getGenericSuperclass())).getActualTypeArguments()[0];
    }
        
    @Override
    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public boolean save(T t) throws Exception {
       
        boolean name = session.save(t) != null;
           
        return (session.save(t) != null);
    }

    @Override
    public void delete(T t) throws Exception {
        session.delete(t);
    }

    @Override
    public void update(T t) throws Exception {
      
         
        session.update(t);
      
    }

    @Override
    public T findById(ID id) throws Exception {
       
        int parseInt = Integer.parseInt((String) id);
        T get = session.get(entityClass,parseInt);
       // return (T) session.get(entityClass,id);
       return get;
    }

    @Override
    public List<T> findAll() throws Exception {
        List list = session.createQuery("FROM " + entityClass.getSimpleName()).list();
     
        return session.createQuery("FROM " + entityClass.getSimpleName()).list();
    }
     @Override
    public List<T> findAllById(ID id) throws Exception {
      
       
        return session.createQuery("FROM " + entityClass.getSimpleName()+"where subid='"+id+"'").list();
    }
    
    
}
