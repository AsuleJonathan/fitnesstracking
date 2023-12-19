package com.asule.app.action.useractions;

import com.asule.app.action.BaseActionClass;
import com.asule.app.bean.sharedbean.MemberBeanI;
import com.asule.app.bean.userbean.MemberBeanImp;
import com.asule.app.model.entity.Member;
import com.asule.database.Database;
import com.asule.view.html.HtmlUserPages;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/Members")
public class MemberAction extends BaseActionClass {

    @EJB(beanName = "userMemberBean")
    MemberBeanI MemberBean;


    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();
        Database database = Database.getDbInstance();


        renderPage(req, res, HtmlUserPages.titleHeader("Upcoming Members") +
                MemberBean.upcomingMembers() +
                HtmlUserPages.titleClosingTags()
        );

    }


}