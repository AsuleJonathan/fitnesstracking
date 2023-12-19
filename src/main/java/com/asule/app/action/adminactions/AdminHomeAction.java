package com.asule.app.action.adminactions;

import com.asule.app.action.BaseActionClass;
import com.asule.app.bean.adminbean.MemberAdminBeanImpl;
import com.asule.app.bean.sharedbean.MemberBeanI;
import com.asule.app.model.entity.Member;
import com.asule.view.html.HtmlAdminPages;
import com.asule.view.html.HtmlComponents;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/admin")
public class AdminHomeAction extends BaseActionClass {

    @EJB(beanName = "adminMemberBean")
    MemberBeanI adminMemberBean;

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

        Member newAdminMember = new Member();
        serializeForm(newAdminMember, req.getParameterMap());


        adminMemberBean.addOrUpdate(newAdminMember);
        res.sendRedirect("./adminMembers");
    }


    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        renderAdminPage(req, res, HtmlAdminPages.adminHomePage(HtmlComponents.form(Member.class) )
               );
    }

}
