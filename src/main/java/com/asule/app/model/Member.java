package com.asule.app.model;

import com.asule.app.view.helper.HtmlForm;
import com.asule.app.view.helper.HtmlFormField;
import com.asule.app.view.helper.HtmlTable;
import com.asule.app.view.helper.HtmlTableColHeader;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "members")
@HtmlTable(addUrl = "./members?action=add")
@HtmlForm(label = "member", url = "./members")
public class Member extends BaseEntity {

    @Column(name = "code")
    @HtmlTableColHeader(header = "member Code")
    @HtmlFormField(label = "member Code", required = true)
    private String code;

    @Column(name = "member_name")
    @HtmlTableColHeader(header = "member Name")
    @HtmlFormField(label = "member Name", required = true)
    private String name;

    @Transient
    private BigDecimal balance;

    @Column(columnDefinition = "longtext")
    private String notes;

    @HtmlFormField(label = "member Category", required = true)
    @Column
    @Enumerated(EnumType.STRING)
    private MemberCategory category;

    @HtmlFormField(label = "member Type", required = true)
    @Column
    @Enumerated(EnumType.STRING)
    private MemberType type;

    public Member(){}

    public Member(String code, String name){
        this.code = code;
        this.name = name;
      
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
