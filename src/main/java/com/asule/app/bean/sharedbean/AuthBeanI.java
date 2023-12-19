package com.asule.app.bean.sharedbean;

import com.asule.app.model.entity.User;

import java.sql.SQLException;

public interface AuthBeanI {
    public User authenticateUser(User loginUser) throws SQLException;
}
