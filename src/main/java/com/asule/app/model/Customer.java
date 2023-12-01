package com.asule.app.model;

import com.asule.app.view.helper.HtmlForm;
import com.asule.app.view.helper.HtmlFormField;
import com.asule.app.view.helper.HtmlTable;
import com.asule.app.view.helper.HtmlTableColHeader;
import com.asule.database.helper.DbTable;
import com.asule.database.helper.DbTableColumn;

import java.io.Serializable;
import java.math.BigDecimal;

@DbTable(name = "customers")
@HtmlTable(addUrl = "./customers?action=add")
@HtmlForm(label = "Customer", url = "./customers")
public class Customer extends BaseEntity {

    @DbTableColumn(name = "name")
    @HtmlTableColHeader(header = "Customer Name")
    @HtmlFormField(label = "Customer Name", required = true)
    private String name;

    @DbTableColumn(name = "address")
    @HtmlTableColHeader(header = "Customer Address")
    @HtmlFormField(label = "Customer Address", required = true)
    private String address;

    @HtmlTableColHeader(header = "Account Balance")
    private BigDecimal accountBalance;

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

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }
}
