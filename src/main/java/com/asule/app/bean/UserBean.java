package com.asule.app.bean;

import com.asule.app.model.entity.User;
import com.asule.database.Database;
import java.io.Serializable;

public class UserBean implements UserBeanI, Serializable {

    Database database = Database.getDbInstance();

    @Override
    public boolean register(User user) {

        if (user.getPassword().equals(user.getConfirmPassword())) {
            database.getUsers().add(new User(100L, user.getUsername(), user.getPassword()));

            return true;
        }

        return false;
    }

    @Override
    public boolean unregister(User user) {
        return true;
    }
}