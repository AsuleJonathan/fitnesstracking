package com.asule.app.bean;

import com.asule.app.model.User;

import java.sql.SQLException;

public interface AuthBeanI {

    User authenticate(User loginUser) throws SQLException;
}
