package com.asule.app.model;

public enum MemberType {

    UNDERWEIGHT("Underweight"),
    OVERWEIGHT("Overweight"),
    AVERAGE("Average Weight"),
    OBESS("Obess"),
    UNFIT("Not Fit");

    private String name;

    MemberType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
