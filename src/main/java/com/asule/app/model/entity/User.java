package com.asule.app.model.entity;


import com.asule.database.helper.DbTable;
import com.asule.database.helper.DbTableColumn;
import com.asule.view.html.FitnessTableColHeader;
import com.asule.view.html.TableActions;

import java.io.Serializable;

@DbTable(name = "users")
public class User extends BaseEntity {

    @DbTableColumn(name = "username", notNull = "not null")
    @FitnessTableColHeader(headerLabel = "Username")
    private String username;
    @DbTableColumn(name = "password", notNull = "not null")
    private String password;
    private String confirmPassword;
    @DbTableColumn(name = "normalMemberships", definition = "int")
    @FitnessTableColHeader(headerLabel = "Normal Membership")
    private int normalMemberships = 0;
    @DbTableColumn(name = "vipMemberships", definition = "int")
    @FitnessTableColHeader(headerLabel = "VIP Membership")
    private int vipMemberships = 0;

    @FitnessTableColHeader(headerLabel = "Actions")
    @TableActions(actions = "Edit")
    private String actions;


    public int getNormalMemberships() {
        return normalMemberships;
    }

    public void setNormalMemberships(int normalMemberships) {
        this.normalMemberships = normalMemberships;
    }

    public int getVipMemberships() {
        return vipMemberships;
    }

    public void setVipMemberships(int vipMemberships) {
        this.vipMemberships = vipMemberships;
    }

    public User() {
    }

    public User(int id, String username, String password) {
        setId(id);
        this.username = username;
        this.password = password;
    }

    public User(int id, String username, String password, int normalMemberships, int vipMemberships) {
        setId(id);
        this.username = username;
        this.password = password;
        this.normalMemberships = normalMemberships;
        this.vipMemberships = vipMemberships;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", normalMemberships=" + normalMemberships +
                ", vipMemberships=" + vipMemberships +
                ", actions='" + actions + '\'' +
                '}';
    }
}
