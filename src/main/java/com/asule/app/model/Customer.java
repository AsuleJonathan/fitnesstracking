package com.asule.app.model;

import com.asule.app.view.helper.HtmlForm;
import com.asule.app.view.helper.HtmlFormField;
import com.asule.app.view.helper.HtmlTable;
import com.asule.app.view.helper.HtmlTableColHeader;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "customers")
@HtmlTable(addUrl = "./customers?action=add")
@HtmlForm(label = "Customer", url = "./customers")
public class Customer extends BaseEntity {

    @Column(name = "name")
    @HtmlTableColHeader(header = "Customer Name")
    @HtmlFormField(label = "Customer Name", required = true)
    private String name;

    @Transient
    @HtmlTableColHeader(header = "member Balance")
    private BigDecimal memberBalance;

    @Embedded
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public BigDecimal getmemberBalance() {
        return memberBalance;
    }

    public void setmemberBalance(BigDecimal memberBalance) {
        this.memberBalance = memberBalance;
    }
}
