package com.asule.database;

import com.asule.app.model.entity.Member;
import com.asule.app.model.entity.BookMembership;
import com.asule.app.model.entity.MembershipManagement;
import com.asule.app.model.entity.User;

import java.io.Serializable;
import java.sql.Connection;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Database implements Serializable {

    private  static  Database dbInstance;

    private Connection connection;

    private  Database(){};
    private List<Object> data = new ArrayList<>();

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    private  String databaseCreatedAt;

    public  static Database getDbInstance(){
        if(dbInstance == null) {
            dbInstance = new Database();
            dbInstance.databaseCreatedAt = DateFormat.getTimeInstance().format(new Date());
            System.out.println( "DB created at: " + dbInstance.getDatabaseCreatedAt());
        }
        return  dbInstance;
    }
    public String getDatabaseCreatedAt() {
        return databaseCreatedAt;
    }



    public List<Object> getData(Class <?> clazz) {
        return data
                .stream()
                .filter(clazz::isInstance)
                .collect(Collectors.toList());
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

    private List<User> users = new ArrayList<>();
    private  List<Member> Members = new ArrayList<>();

    private List<MembershipManagement> MembershipManagement = new ArrayList<>();

    private List<BookMembership> bookMembership = new ArrayList<>();

    public List<BookMembership> getBookMembership() {
        return bookMembership;
    }

    public void setBookMembership(List<BookMembership> bookMembership) {
        this.bookMembership = bookMembership;
    }

    public List<MembershipManagement> getMembershipManagement() {
        return MembershipManagement;
    }

    public void setMembershipManagement(List<MembershipManagement> MembershipManagement) {
        this.MembershipManagement = MembershipManagement;
    }

    public List<Member> getMembers() {
        return Members;
    }

    public void setMembers(List<Member> Members) {
        this.Members = Members;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }


}
