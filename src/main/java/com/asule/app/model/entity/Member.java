package com.asule.app.model.entity;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

public class Member implements Serializable {

    private String Id;

    private String name;

    

    public Member(){

    }

    public Member(String id, String name, Object object){
        this.Id = id;
        this.name = name;
       
    }

    public String getId() {
        return Id;
    }

    public void setCode(String id) {
        this.Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String tableRow(){

        StringBuilder trBuilder = new StringBuilder();

        trBuilder.append("<tr>");
        trBuilder.append("<td>").append(StringUtils.trimToEmpty(getId())).append("</td>");
        trBuilder.append("<td>").append(StringUtils.trimToEmpty(getName())).append("</td>");
        trBuilder.append("<tr>");

        return trBuilder.toString();
    }
}
