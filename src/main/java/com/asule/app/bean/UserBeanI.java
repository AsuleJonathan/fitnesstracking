package com.asule.app.bean;

import com.asule.app.model.User;

import java.sql.SQLException;

public interface UserBeanI extends GenericBeanI<User>{

    boolean register(User user) throws SQLException;

    boolean unregister(User user);
}
