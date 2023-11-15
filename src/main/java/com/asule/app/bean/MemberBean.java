package com.asule.app.bean;

import com.asule.app.model.entity.Member;
import com.asule.app.view.html.HtmlComponent;
import com.asule.database.Database;

import java.io.Serializable;
import java.util.List;

public class MemberBean implements MemberBeanI, Serializable {

    @Override
    public String MembersDetails() {
        List<Member> members = Database.getDbInstance().getMembers();
        // Implement the logic to generate details about members
        // For example, you can iterate through the list and concatenate member details
        StringBuilder details = new StringBuilder();
        
        for (Member member : members) {
            details.append("Member ID: ").append(member.getId())
                   .append(", Name: ").append(member.getName())
                   .append(", Weight: ").append(member.getWeight())
                   .append(", Notes: ").append(member.getNotes())
                   .append("\n");
        }
        
        return details.toString();
    }

    public Member addOrUpdateMember(Member member) {
        Database database = Database.getDbInstance();
        database.getMembers().add(member);
        return member;
    }

    public void deleteMember(Member member) {
        Database database = Database.getDbInstance();
        database.getMembers().remove(member);
    }

    @Override
    public void deleteAccount(Member member) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAccount'");
    }
}
