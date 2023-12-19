package com.asule.app.bean.userbean;

import com.asule.app.bean.GenericBeanI;
import com.asule.app.model.entity.User;

import java.sql.SQLException;

public interface UserBeanI extends GenericBeanI<User> {
    boolean registerUser(User user) throws SQLException;

    boolean unregisterUser(User user);

    public String allRegisteredUsers();
}
