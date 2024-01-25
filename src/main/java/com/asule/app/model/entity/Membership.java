package com.asule.app.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table (name = "membership")

public class Membership extends BaseEentity {
    
    @Column (name = "startDate")
    private String startDate;
    
    @Column (name = "endDate")
    private String endDate;
    
    @Column (name = "startTime")
    private String startTime;    
    
    @Column (name = "endTime")
    private String endTime;

    @Column (name = "membershipType")
    @Enumerated(EnumType.STRING)
    private MembershiptypeEnum membershipType;

    @Column (name = "membershipLevel")
    @Enumerated(EnumType.STRING)
    private MembershipLevelEnum membershipLevel;

    

    public Membership() {
    }

    
    public Membership(int Id,String startDate, String endDate, String startTime, String endTime,
            MembershiptypeEnum membershipType, MembershipLevelEnum membershipLevel) {
            setId(Id);        
        this.startDate = startDate;
        this.endDate = endDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.membershipType = membershipType;
        this.membershipLevel = membershipLevel;
    }


    public MembershiptypeEnum getMembershipType() {
        return membershipType;
    }
    public void setMembershipType(MembershiptypeEnum membershipType) {
        this.membershipType = membershipType;
    }
    public MembershipLevelEnum getMembershipLevel() {
        return membershipLevel;
    }
    public void setMembershipLevel(MembershipLevelEnum membershipLevel) {
        this.membershipLevel = membershipLevel;
    }
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    public String getStartTime() {
        return startTime;
    }
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    public String getEndTime() {
        return endTime;
    }
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    




    
}
