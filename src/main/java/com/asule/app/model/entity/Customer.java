package com.asule.app.model.entity;

import com.asule.app.view.html.AsuleHtmlForm;
import com.asule.app.view.html.AsuleHtmlFormField;
import com.asule.app.view.html.AsuleTableColHeader;

import java.io.Serializable;

@AsuleHtmlForm(label = "Customer", url = "./customers")
public class Customer implements Serializable {

    @AsuleTableColHeader(header = "Customer Name")
    @AsuleHtmlFormField(label = "Name")
    private String name;

    @AsuleTableColHeader(header = "Customer Address")
    @AsuleHtmlFormField(label = "Customer Address")
    private String address;

    @AsuleTableColHeader(header = "Customer Weight")
    private String weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
