package com.asule.app.action;

import com.asule.app.bean.MemberBeanI;
import com.asule.app.model.Member;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/members")
public class MemberAction extends BaseAction {

    @EJB
    private MemberBeanI memberBean;

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        renderPage(req, resp, 1, Member.class, memberBean.list(new Member()));
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        memberBean.addOrUpdate(serializeForm(Member.class, req.getParameterMap()));
        resp.sendRedirect("./members");
    }

}
