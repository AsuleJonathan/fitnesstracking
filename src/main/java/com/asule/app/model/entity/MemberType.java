package com.asule.app.model.entity;

import java.io.Serializable;

public enum MemberType implements Serializable {
    OVERWEIGHT("OveeWeight"),
    UNDERWEIGHT("Underweight"),
    OBESS("Unhealthy Obess"),
    THIN("Unhealthy thin"),
    NORMAL("normal Weight");
    private String name;

    MemberType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
