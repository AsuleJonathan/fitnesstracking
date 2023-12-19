package com.asule.app.model.entity;

import java.io.Serializable;

public enum MembershipType implements Serializable {
    VIP("VIP"),
    NORMAL("Normal");

    private String name;
    MembershipType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
