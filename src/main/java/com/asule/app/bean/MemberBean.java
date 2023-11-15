package com.asule.app.bean;

import com.asule.app.model.entity.Member;
import com.asule.database.Database;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class MemberBean implements MemberBeanI, Serializable {

public String MembersDetails() {
    List<Member> members = Database.getDbInstance().getMembers();

    StringBuilder detailsBuilder = new StringBuilder();

    detailsBuilder.append("<table>");
    detailsBuilder.append("<tr><th>ID</th><th>Name</th></tr>");

    for (Member member : members) {
        detailsBuilder.append("<tr>");
        detailsBuilder.append("<td>").append(StringUtils.trimToEmpty(member.getId())).append("</td>");
        detailsBuilder.append("<td>").append(StringUtils.trimToEmpty(member.getName())).append("</td>");
        detailsBuilder.append("</tr>");
    }

    detailsBuilder.append("</table>");

    return detailsBuilder.toString();
}

    public Member addOrUpdateMember(Member member) {
        Database database = Database.getDbInstance();
        database.getMembers().add(member);
        return member;
    }

    @Override
    public void deleteAccount(Member member) {
        Database database = Database.getDbInstance();
        List<Member> members = database.getMembers();
        members.removeIf(m -> m.getId().equals(member.getId()));
    }

}
