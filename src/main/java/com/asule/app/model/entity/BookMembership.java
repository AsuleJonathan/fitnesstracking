package com.asule.app.model.entity;

import com.asule.database.helper.DbTable;
import com.asule.database.helper.DbTableColumn;
import com.asule.view.html.FitnessFormField;
import com.asule.view.html.FitnessHtmlCard;
import com.asule.view.html.FitnessHtmlForm;

@DbTable(name = "bookMembership")
@FitnessHtmlForm(label = "Membership", url = "./book")
public class BookMembership extends BaseEntity {
    @FitnessFormField(name = "name")
    @DbTableColumn(name = "name", notNull = "not null")
    private String name;

    @DbTableColumn(name = "MembershipNumber", notNull = "not null")
    @FitnessHtmlCard(cssClass = "MembershipNumber")
    private String MembershipNumber;

    @FitnessHtmlCard(cssClass = "MembershipMemberType")
    private String MemberType = "CAF Champions League";

    @FitnessHtmlCard(cssClass = "newMembershipInfoDetails")
    private String homeTeam = "Gor Mahia";
    @FitnessHtmlCard(cssClass = "newMembershipInfoDetails")
    private  String awayTeam = "AFC Leopards";
    @FitnessFormField(name = "email")
    @DbTableColumn(name = "email")

    private String email;
    @FitnessFormField(label = "Phone Number", name = "phoneNumber")
    @DbTableColumn(name = "phoneNumber", notNull = "not null")
    private String phoneNumber;
    @FitnessFormField(label="Membership Type", name = "MembershipType")
    @DbTableColumn(name = "MembershipType", notNull = "not null")
    private String MembershipType;
    @FitnessHtmlCard(cssClass = "MembershipDate")
    private String date = "2023/11/11";
    @FitnessFormField(label= "Number of Memberships", fieldType = "number", name = "numberOfMemberships")
    @DbTableColumn(name = "totalMemberships", notNull = "not null", definition = "int")
    private int numberOfMemberships;





    public BookMembership() {
    }




    public BookMembership(int id,String MembershipNumber, String name, String email, String phoneNumber, String MembershipType, int numberOfMemberships) {
        setId(id);
        this.MembershipNumber = MembershipNumber;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.MembershipType = MembershipType;
        this.numberOfMemberships = numberOfMemberships;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMembershipType() {
        return MembershipType;
    }

    public void setMembershipType(String MembershipType) {
        this.MembershipType = MembershipType;
    }

    public int getNumberOfMemberships() {
        return numberOfMemberships;
    }

    public void setNumberOfMemberships(int numberOfMemberships) {
        this.numberOfMemberships = numberOfMemberships;
    }

    public String getMembershipNumber() {
        return MembershipNumber;
    }

    public void setMembershipNumber(String MembershipNumber) {
        this.MembershipNumber = MembershipNumber;
    }
}
