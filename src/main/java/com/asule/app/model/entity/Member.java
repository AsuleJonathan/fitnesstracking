package com.asule.app.model.entity;

import com.asule.app.view.html.AsuleHtmlForm;
import com.asule.app.view.html.AsuleHtmlFormField;
import com.asule.app.view.html.AsuleTableColHeader;

import java.io.Serializable;

@AsuleHtmlForm(label = "Member", url = "./members")
public class Member implements Serializable {

    @AsuleTableColHeader(header = "Id Of The Member")
    @AsuleHtmlFormField(label = "Member Id")
    private String Id;

    @AsuleTableColHeader(header = "Name Of the member")
    @AsuleHtmlFormField(label = "Member Name")
    private String name;

    
    @AsuleTableColHeader(header = "Weight Of the member")
    @AsuleHtmlFormField(label = "Member Weight")
    private String weight;


    @AsuleTableColHeader(header = "Notes On the member")
    @AsuleHtmlFormField(label = "Members Notes")
    private String notes;

    public Member() {
    }

    public Member(String Id, String name, String weight, String notes) {
        this.Id = Id;
        this.name = name;
        this.weight = weight;
        this.notes = notes;
    }
    

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
