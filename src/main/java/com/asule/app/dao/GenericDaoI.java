package com.asule.app.dao;

import com.asule.database.MysqlDatabase;

import java.io.Serializable;
import java.util.List;

public interface GenericDaoI <T> extends Serializable {

    List<T> list(Object entity);

    void addOrUpdate(T entity);

    void delete(T entity);

    MysqlDatabase getDatabase();

    void setDatabase(MysqlDatabase database);

}
