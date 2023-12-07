package com.asule.app.bean;

import com.asule.app.model.Member;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote
public class MemberBean extends GenericBean<Member> implements MemberBeanI {

    @PostConstruct
    public void init(){
        System.out.println("Bean has bean created!!");
    }

    @Override
    public void addOrUpdate(Member member) {
        if (member.getType() == null)
            throw new RuntimeException("Invalid member type");

        getDao().addOrUpdate(member);

    }

    @PreDestroy
    public void atDestruction(){

    }

}
