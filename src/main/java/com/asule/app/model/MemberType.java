package com.asule.app.model;

public enum MemberType {

    ASSET("Asset"),
    LIABILITY("Liability"),
    OWNERS_EQUITY("Owners Equity"),
    INCOME("Income"),
    EXPENSE("Expense");

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
