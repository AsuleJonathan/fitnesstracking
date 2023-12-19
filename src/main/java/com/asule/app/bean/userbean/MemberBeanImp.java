package com.asule.app.bean.userbean;

import com.asule.app.bean.GenericBeanImpl;
import com.asule.app.bean.sharedbean.MemberBeanI;
import com.asule.app.model.entity.Member;
import com.asule.database.Database;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import java.io.Serializable;
import java.util.List;
@Stateless(name = "userMemberBean")
@Remote
public class MemberBeanImp extends GenericBeanImpl<Member> implements MemberBeanI, Serializable {
    public  String upcomingMembers(){
        List<Member> Members = Database.getDbInstance().getMembers();

        StringBuilder tbBuilder = new StringBuilder();


        for(Member Member: Members)
            tbBuilder.append(Member.tableRow());

        return tbBuilder.toString();
    };



}
