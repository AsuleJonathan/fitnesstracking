package com.asule.app.model;

public enum MemberCategory {

    HEADER("Header"),
    POSTING("Posting");

    private String name;

    MemberCategory(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
