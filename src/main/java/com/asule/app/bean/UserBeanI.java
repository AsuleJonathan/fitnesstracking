package com.asule.app.bean;

import com.asule.app.model.entity.User;

public interface UserBeanI {

    boolean register(User user);

    boolean unregister(User user);
}