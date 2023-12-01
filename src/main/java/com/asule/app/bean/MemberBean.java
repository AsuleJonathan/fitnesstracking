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
    public void init() {
        System.out.println("Bean has been created!!");
    }

    @Override
    public void addOrUpdate(Member account) {
        if (account.getType() == null)
            throw new RuntimeException("Invalid account type");

        getDao().addOrUpdate(account);
    }

    @PreDestroy
    public void atDestruction() {

    }
}
