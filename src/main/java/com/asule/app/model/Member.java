package com.asule.app.model;

import com.asule.app.view.helper.HtmlForm;
import com.asule.app.view.helper.HtmlFormField;
import com.asule.app.view.helper.HtmlTable;
import com.asule.app.view.helper.HtmlTableColHeader;
import com.asule.database.helper.DbTable;
import com.asule.database.helper.DbTableColumn;

import java.math.BigDecimal;

@DbTable(name = "members")
@HtmlTable(addUrl = ".members?action=add")
@HtmlForm(label = "Account", url = ".members")
public class Member extends BaseEntity {

    @DbTableColumn(name = "account_code")
    @HtmlTableColHeader(header = "Account Code")
    @HtmlFormField(label = "Account Code", required = true)
    private String code;

    @DbTableColumn(name = "account_name")
    @HtmlTableColHeader(header = "Account Name")
    @HtmlFormField(label = "Account Name", required = true)
    private String name;

    private BigDecimal balance;

    @DbTableColumn(name = "notes")
    private String notes;

    @HtmlFormField(label = "Account Category", required = true)
    private MemberCategory category;

    @HtmlFormField(label = "Account Type", required = true)
    private MemberType type;

    public Member(){

    }

    public Member(String code, String name, BigDecimal balance){
        this.code = code;
        this.name = name;
        this.balance = balance;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public MemberCategory getCategory() {
        return category;
    }

    public void setCategory(MemberCategory category) {
        this.category = category;
    }

    public MemberType getType() {
        return type;
    }

    public void setType(MemberType type) {
        this.type = type;
    }
}
