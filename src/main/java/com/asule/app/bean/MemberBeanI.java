package com.asule.app.bean;

import com.asule.app.model.entity.Member;

public interface MemberBeanI {

    String MembersDetails();

    Member addOrUpdateMember(Member member);

    void deleteAccount(Member member);
}
