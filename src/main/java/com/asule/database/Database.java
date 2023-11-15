package com.asule.database;

import com.asule.app.model.entity.Member;
import com.asule.app.model.entity.User;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Database implements Serializable {

    private String databaseCreateAt;

    private List<User> users = new ArrayList<>();

    private List<Member> members = new ArrayList<>();

    private static Database dbInstance;

    private Database(){}

    public static Database getDbInstance(){
        if (dbInstance == null) {
            dbInstance = new Database();
            dbInstance.databaseCreateAt = DateFormat.getDateTimeInstance().format(new Date());
            System.out.println("Database created at " + dbInstance.getDatabaseCreateAt());
        }

        return dbInstance;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setAccounts(List<Member> members) {
        this.members = members;
    }

    public String getDatabaseCreateAt() {
        return databaseCreateAt;
    }
}
