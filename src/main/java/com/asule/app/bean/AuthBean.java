package com.asule.app.bean;

import com.asule.app.model.User;
import com.asule.app.utility.HashText;
import com.asule.database.MysqlDatabase;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

@Stateless
@Remote
public class AuthBean implements AuthBeanI, Serializable {

    @EJB
    MysqlDatabase database;

    @Inject
    private HashText hashText;

    public User authenticate(User loginUser) {

        try {
            loginUser.setPassword(hashText.hash(loginUser.getPassword()));
        } catch (Exception ex){
            throw new RuntimeException(ex.getMessage());
        }

        List<User> users = database.fetch(loginUser);

        if (users.isEmpty() || users.get(0) == null)
            throw new RuntimeException("Invalid user!!");

        return users.get(0);
    }
}
