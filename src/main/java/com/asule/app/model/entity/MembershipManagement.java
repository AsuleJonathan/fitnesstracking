package com.asule.app.model.entity;

import com.asule.database.helper.DbTable;
import com.asule.database.helper.DbTableColumn;
import com.asule.view.html.FitnessTableColHeader;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

@DbTable(name = "MembershipManagement")
public class MembershipManagement extends BaseEntity {
    @FitnessTableColHeader(headerLabel = "Member Type")
    @DbTableColumn(name = "MemberType", notNull = "not null")
    private String MemberType;
    @FitnessTableColHeader(headerLabel = "Total Memberships")
    @DbTableColumn(name = "totalMemberships", notNull = "not null", definition = "int")
    private int totalMembershipsAllocated;
    @FitnessTableColHeader(headerLabel = "VIP Memberships")
    @DbTableColumn(name = "totalVip", notNull = "not null", definition = "int")
    private int totalVipMembershipsLocated;
    @FitnessTableColHeader(headerLabel = "VIP Membership Amount")
    @DbTableColumn(name = "vipAmount", notNull = "not null", definition = "int")
    private int MembershipAmountVIP;
    @FitnessTableColHeader(headerLabel = "Normal Memberships")
    @DbTableColumn(name = "totalNormal", notNull = "not null", definition="int")
    private int totalNormalMembershipsAllocated;
    @FitnessTableColHeader(headerLabel = "Normal Membership Amount")
    @DbTableColumn(name = "normalAmount", notNull = "not null", definition = "int")
    private int MembershipAmountNormal;

    @FitnessTableColHeader(headerLabel = "Action")
    private String action = "Edit";

    public MembershipManagement() {
    }

    public MembershipManagement(int id,String MemberType, int totalMembershipsAllocated, int totalVipMembershipsLocated, int MembershipAmountVIP, int totalNormalMembershipsAllocated, int MembershipAmountNormal) {
        setId(id);
        this.MemberType = MemberType;
        this.totalMembershipsAllocated = totalMembershipsAllocated;
        this.totalVipMembershipsLocated = totalVipMembershipsLocated;
        this.MembershipAmountVIP = MembershipAmountVIP;
        this.totalNormalMembershipsAllocated = totalNormalMembershipsAllocated;
        this.MembershipAmountNormal = MembershipAmountNormal;
    }

    public String getMemberType() {
        return MemberType;
    }

    public void setMemberType(String MemberType) {
        this.MemberType = MemberType;
    }

    public int getTotalMembershipsAllocated() {
        return totalMembershipsAllocated;
    }

    public void setTotalMembershipsAllocated(int totalMembershipsAllocated) {
        this.totalMembershipsAllocated = totalMembershipsAllocated;
    }

    public int getTotalVipMembershipsLocated() {
        return totalVipMembershipsLocated;
    }

    public void setTotalVipMembershipsLocated(int totalVipMembershipsLocated) {
        this.totalVipMembershipsLocated = totalVipMembershipsLocated;
    }

    public int getMembershipAmountVIP() {
        return MembershipAmountVIP;
    }

    public void setMembershipAmountVIP(int MembershipAmountVIP) {
        this.MembershipAmountVIP = MembershipAmountVIP;
    }

    public int getTotalNormalMembershipsAllocated() {
        return totalNormalMembershipsAllocated;
    }

    public void setTotalNormalMembershipsAllocated(int totalNormalMembershipsAllocated) {
        this.totalNormalMembershipsAllocated = totalNormalMembershipsAllocated;
    }

    public int getMembershipAmountNormal() {
        return MembershipAmountNormal;
    }

    public void setMembershipAmountNormal(int MembershipAmountNormal) {
        this.MembershipAmountNormal = MembershipAmountNormal;
    }


    public String MembershipPricingTableRow(){
        StringBuilder tbBuilder = new StringBuilder();


        tbBuilder.append("<tr>");
        //tbBuilder.append("<td>").append(StringUtils.trimToEmpty(getMembershipType())).append("</td>");
        tbBuilder.append("<td>").append(getMembershipAmountVIP()).append("</td>");
        tbBuilder.append("<td>").append(getMembershipAmountNormal()).append("</td>");
        tbBuilder.append("<td>");
        tbBuilder.append("<div class=\"homeButtons\">");
        tbBuilder.append("<a href=\"./#\" class=\"homeOutlineButton\" >Edit</a>");
        tbBuilder.append("<a href=\"./#\" class=\"homeNormalButton\">Delete</a>");
        tbBuilder.append("</div>");
        tbBuilder.append("</td>");
        tbBuilder.append("</tr>");

        return tbBuilder.toString();

    }

    @Override
    public String toString() {
        return "MembershipManagement{" +
                "MemberType='" + MemberType + '\'' +
                ", totalMembershipsAllocated=" + totalMembershipsAllocated +
                ", totalVipMembershipsLocated=" + totalVipMembershipsLocated +
                ", MembershipAmountVIP=" + MembershipAmountVIP +
                ", totalNormalMembershipsAllocated=" + totalNormalMembershipsAllocated +
                ", MembershipAmountNormal=" + MembershipAmountNormal +
                ", action='" + action + '\'' +
                '}';
    }
}
