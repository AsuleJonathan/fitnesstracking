package com.asule.app.bean;

import com.asule.app.model.entity.User;
import com.asule.database.Database;

import java.io.Serializable;

public class AuthBean implements AuthBeanI, Serializable {

    Database database = Database.getDbInstance();

    public User authenticate(User loginUser) {

        User userDetails = null;

        for (User user : database.getUsers()) {
            if (loginUser.getUsername().equals(user.getUsername())
                    && loginUser.getPassword().equals(user.getPassword())) {
                userDetails = user;

                break;

            }
        }

        return userDetails;
    }
}