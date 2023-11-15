package com.asule.app.action;

import com.asule.app.bean.MemberBean;
import com.asule.app.bean.MemberBeanI;
import com.asule.app.model.entity.Member;
import com.asule.app.view.html.AppPage;
import com.asule.app.view.html.HtmlComponent;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/home")
public class HomeAction extends HttpServlet {

    MemberBeanI memberBean = new MemberBean();

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        HttpSession httpSession = req.getSession();

        new AppPage().renderHtml(req, resp, 0,
                HtmlComponent.form(Member.class) + memberBean.MembersDetails());

    }

}
