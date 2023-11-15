package com.asule.app.action;

import com.asule.app.bean.MemberBean;
import com.asule.app.bean.MemberBeanI;
import com.asule.app.view.html.AppPage;
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
        "<h2>Members details</h2>" +
            "<br/>Add Member<br/><form action=\"./members\" method=\"post\">" +
                "  <label for=\"code\">Member ID:</label><br>" +
                "  <input type=\"number\" id=\"number\" name=\"code\" ><br>" +
                "  <label for=\"name\">Member Name:</label><br>" +
                "  <input type=\"text\" id=\"name\" name=\"name\" ><br><br>" +
                "  <input type=\"submit\" value=\"Submit\">" +
            "</form><br/>" + memberBean.MembersDetails());

    }

}
