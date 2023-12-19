package com.asule.app.action.adminactions;

import com.asule.app.action.BaseActionClass;
import com.asule.app.bean.sharedbean.MemberBeanI;
import com.asule.app.bean.adminbean.MemberAdminBeanImpl;
import com.asule.app.model.entity.Member;

import com.asule.database.Database;
import com.asule.view.html.HtmlAdminPages;
import com.asule.view.html.HtmlComponents;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/adminMembers")
public class AdminMembersAction extends BaseActionClass {

    @EJB(beanName = "adminMemberBean")
    MemberBeanI adminMemberBean;


    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        renderAdminPage(req, res, HtmlAdminPages.adminMembersPage( HtmlComponents.table(Member.class,adminMemberBean.list(Member.class) ))
                );

    }
}

