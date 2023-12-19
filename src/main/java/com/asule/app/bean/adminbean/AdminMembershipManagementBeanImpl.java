package com.asule.app.bean.adminbean;

import com.asule.app.bean.GenericBeanImpl;
import com.asule.app.model.entity.MembershipManagement;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote
public class AdminMembershipManagementBeanImpl extends GenericBeanImpl<MembershipManagement> implements AdminMembershipManagementI {
    @Override
    public void addOrUpdate(MembershipManagement MembershipManagement){
        getDao().addOrUpdate(MembershipManagement);
    }
}
