package com.asule.app.bean.userbean;

import com.asule.app.bean.GenericBeanImpl;
import com.asule.app.model.entity.BookMembership;
import com.asule.utils.MembershipNumber;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Remote
public class BookMembershipImpl extends GenericBeanImpl<BookMembership> implements BookMembershipI {
    @Inject
    @Named("Membership")
    private MembershipNumber MembershipNumberGenerator;

    @Override
    public void addOrUpdate(BookMembership bookMembership) {
        bookMembership.setMembershipNumber(MembershipNumberGenerator.generate());
        getDao().addOrUpdate(bookMembership);
    }

}
