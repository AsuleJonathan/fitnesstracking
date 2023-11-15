package com.asule.database;

<<<<<<< HEAD
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

=======


import com.asule.application.model.Member;
import com.asule.application.model.User;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Database implements Serializable {
    private List<Member> members = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    private static Database dbInstance;
    private  String databaseCreatedAt;

    public Database() {}
    public static Database getDbInstance() {
        if(dbInstance == null) {
            dbInstance = new Database();
            System.out.println("Database instance created");
        }
        return dbInstance;
    }

    public List<Member> getEvents() {
        return members;
    }

    public void setEvents(List<Member> events) {
        if(members != null) {
            this.members = events;
        }
    }

>>>>>>> b5ad14254e74ba71eeee429b12c13fad17f02132
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
<<<<<<< HEAD
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
=======
        if(users != null) {
            this.users = users;
        }
    }
    public List<Member> getMember() {
        return members;
    }
    
    public String getDatabaseCreatedAt() {
        return null;
>>>>>>> b5ad14254e74ba71eeee429b12c13fad17f02132
    }
}
