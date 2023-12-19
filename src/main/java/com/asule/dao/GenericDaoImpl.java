package com.asule.dao;

import com.asule.app.bean.GenericBeanI;
import com.asule.app.model.entity.Member;
import com.asule.app.model.entity.MembershipManagement;
import com.asule.app.model.entity.User;
import com.asule.database.Database;
import com.asule.database.MySqlDatabase;

import java.util.ArrayList;
import java.util.List;

public class GenericDaoImpl<T> implements GenericDaoI<T> {
    private MySqlDatabase database;

    @Override
    public List<T> list(Class<?> entity) {
        return (List<T>) database.fetch(entity);
    }

    @Override
    public T fetchSingle(Class<?> entity, int id) {
        return (T) database.fetchSingle(entity, id);
    }

    @Override
    public void addOrUpdate(T entity) {
        database.saveOrUpdate(entity);
    }
    @Override
    public void delete(T entity) {

    }

    public MySqlDatabase getDatabase() {
        return database;
    }

    public void setDatabase(MySqlDatabase database) {
        this.database = database;
    }
}
