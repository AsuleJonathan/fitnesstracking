package com.asule.app.bean;

import com.asule.app.model.entity.User;

public interface AuthBeanI {

    User authenticate(User loginUser);
}