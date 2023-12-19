package com.asule.app.bean.sharedbean;

import com.asule.app.bean.GenericBeanI;
import com.asule.app.bean.GenericBeanImpl;
import com.asule.app.model.entity.Member;

import javax.ejb.Remote;

@Remote
public interface MemberBeanI extends GenericBeanI<Member>  {
    public  String upcomingMembers();

}
