package com.asule.app.bean;

import com.asule.dao.GenericDaoI;
import com.asule.dao.GenericDaoImpl;
import com.asule.database.MySqlDatabase;

import javax.ejb.EJB;
import java.util.List;

public class GenericBeanImpl<T> implements GenericBeanI<T> {

    @EJB
    MySqlDatabase database;
   private final GenericDaoI<T> genericDaoI = new GenericDaoImpl<>();

    @Override
    public List<T> list(Class<?> entity) {
        genericDaoI.setDatabase(database);
        return genericDaoI.list(entity);
    }

    @Override
    public T selectSingle(Class<?> entity, int id) {
        genericDaoI.setDatabase(database);
        return genericDaoI.fetchSingle(entity, id);
    }

    @Override
    public void addOrUpdate(T entity) {
        genericDaoI.setDatabase(database);
        genericDaoI.addOrUpdate(entity);
    }

    @Override
    public void delete(T entity) {

    }

    public GenericDaoImpl<T> getDao(){
        genericDaoI.setDatabase(database);
        return (GenericDaoImpl<T>)  genericDaoI;
    }
}
