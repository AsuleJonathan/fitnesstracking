package com.asule.app.model.entity;

import com.asule.database.helper.DbTable;
import com.asule.database.helper.DbTableColumn;
import com.asule.view.html.FitnessFormField;
import com.asule.view.html.FitnessHtmlForm;
import com.asule.view.html.FitnessTableColHeader;
import org.apache.commons.lang3.StringUtils;

@FitnessHtmlForm(label = "Member", url = "./admin", httpMethod = "POST")
@DbTable(name = "Members")
public class Member extends BaseEntity {


    @FitnessFormField(label = "Member Type")
    @FitnessTableColHeader(headerLabel = "Member Type")
    @DbTableColumn(name = "MemberType", notNull = "not null")
    private String MemberType;
    @FitnessFormField(label = "Member Time", fieldType = "time")
    @FitnessTableColHeader(headerLabel = "Time")
    @DbTableColumn(name = "MemberTime", notNull = "not null")
    private String MemberTime;
    @FitnessFormField(label = "Member Location")
    @FitnessTableColHeader(headerLabel = "Location")
    @DbTableColumn(name = "MemberLocation", notNull = "not null")
    private String MemberLocation;
    @FitnessFormField(label = "Member Date", fieldType = "date")
    @FitnessTableColHeader(headerLabel = "Date")
    @DbTableColumn(name = "MemberDate", notNull = "not null")
    private String MemberDate;
    @FitnessTableColHeader(headerLabel = "Action")
    private String action = "Edit";


    public String getMemberType() {
        return MemberType;
    }


    public Member(int id,String MemberType, String MemberTime, String MemberLocation, String homeTeam,
                   String awayTeam, String MemberDate) {
        setId(id);
        this.MemberType = MemberType;
        this.MemberTime = MemberTime;
        this.MemberLocation = MemberLocation;

        this.MemberDate = MemberDate;
    }

    public String getMemberTime() {
        return MemberTime;
    }

    public void setMemberTime(String MemberTime) {
        this.MemberTime = MemberTime;
    }

    public String getMemberDate() {
        return MemberDate;
    }

    public void setMemberDate(String MemberDate) {
        this.MemberDate = MemberDate;
    }



    public String getMemberLocation() {
        return MemberLocation;
    }

    public void setMemberLocation(String MemberLocation) {
        this.MemberLocation = MemberLocation;
    }

    public void setMemberType(String MemberType) {
        this.MemberType = MemberType;
    }

    public Member() {
    }

    public String tableRow() {
        StringBuilder tbBuilder = new StringBuilder();
        tbBuilder.append("<div class=\"oneMember\">");
        tbBuilder.append("<div class=\"Member\">");
        // tbBuilder.append("<p>").append(StringUtils.trimToEmpty(getMemberType())).append("</p>");
        tbBuilder.append(" </div>");
        tbBuilder.append("  <div class=\"timeLocation\">");
        tbBuilder.append("<p>").append(StringUtils.trimToEmpty(getMemberTime())).append("</p>");
        tbBuilder.append("<p>").append(StringUtils.trimToEmpty(getMemberLocation())).append("</p>");
        tbBuilder.append(" </div>");
        tbBuilder.append("<div class=\"date\">");
        tbBuilder.append("<td>").append(StringUtils.trimToEmpty(getMemberDate())).append("</td>");
        tbBuilder.append(" </div>");
        tbBuilder.append("<div class=\"Membership\">");
        tbBuilder.append("  <div class=\"outlineMembershipButton\"><a href=\"./book\">Buy Membership</a> </div>");
        tbBuilder.append("</div>");
        tbBuilder.append("</div>");
        return tbBuilder.toString();

    }

    public String tableAdminRow() {
        StringBuilder tbBuilder = new StringBuilder();
        tbBuilder.append("<div class=\"oneMember\">");
        tbBuilder.append("<div class=\"Member\">");
        // tbBuilder.append("<p>").append(StringUtils.trimToEmpty(getMemberType())).append("</p>");
        tbBuilder.append(" </div>");
        tbBuilder.append("  <div class=\"timeLocation\">");
        tbBuilder.append("<p>").append(StringUtils.trimToEmpty(getMemberTime())).append("</p>");
        tbBuilder.append("<p>").append(StringUtils.trimToEmpty(getMemberDate())).append("</p>");
        tbBuilder.append("<p>").append(StringUtils.trimToEmpty(getMemberLocation())).append("</p>");
        tbBuilder.append(" </div>");

        tbBuilder.append("  <div class=\"homeButtons\">\n" +
                "              <a href=\"./#\" class=\"homeOutlineButton\" >Edit</a>\n" +
                "              <a href=\"./#\" class=\"homeNormalButton\">Delete</a>\n" +
                "        </div>");
        tbBuilder.append("</div>");
        return tbBuilder.toString();

    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

}
