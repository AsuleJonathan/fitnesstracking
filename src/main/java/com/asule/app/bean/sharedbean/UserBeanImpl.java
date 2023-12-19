package com.asule.app.bean.sharedbean;

import com.asule.app.bean.GenericBeanImpl;
import com.asule.app.bean.userbean.UserBeanI;
import com.asule.app.model.entity.User;
import com.asule.database.Database;
import com.asule.database.MySqlDatabase;
import com.asule.utils.HashText;
import com.asule.view.html.HtmlComponents;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Remote
@Stateless
public class UserBeanImpl extends GenericBeanImpl<User> implements UserBeanI {

    @Inject
    private HashText hashText;



    @Override
    public boolean registerUser(User user) throws SQLException {

        if (!user.getPassword().equals(user.getConfirmPassword()))
            throw new RuntimeException("Password & confirm password do not match");

        //1. check if username already exist

//        List<User> users = list(user.getClass());
//        if (!users.isEmpty())
//            throw new RuntimeException("User already exists!");
        //2. hash password

        try {
            user.setPassword(hashText.hash(user.getPassword()));
        } catch (Exception ex){
            throw new RuntimeException(ex.getMessage());
        }

        //3. initiate event to send email ...Observer design pattern

        getDao().addOrUpdate(user);

        return false;

    };

    @Override
    public boolean unregisterUser(User user) {
    return false;
    }

    @Override
    public String allRegisteredUsers() {
        List<User> users = Database.getDbInstance().getUsers();

        return HtmlComponents.table(User.class,users);
    }



}
