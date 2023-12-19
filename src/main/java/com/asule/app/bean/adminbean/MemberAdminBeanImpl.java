package com.asule.app.bean.adminbean;

import com.asule.app.bean.GenericBeanImpl;
import com.asule.app.bean.sharedbean.MemberBeanI;
import com.asule.app.model.entity.Member;
import com.asule.database.Database;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import java.util.List;

@Stateless(name = "adminMemberBean")
@Remote
public class MemberAdminBeanImpl extends GenericBeanImpl<Member> implements MemberBeanI {

    @Override
    public void addOrUpdate(Member Member) {
         getDao().addOrUpdate(Member);
    }

    @Override
    public String upcomingMembers() {
        List<Member> Members = Database.getDbInstance().getMembers();

        StringBuilder tbBuilder = new StringBuilder();


        for(Member Member: Members)
            tbBuilder.append(Member.tableAdminRow());

        return tbBuilder.toString();
    }


}
