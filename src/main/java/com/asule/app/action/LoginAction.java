package com.asule.app.action;

import com.asule.app.bean.AuthBean;
import com.asule.app.bean.AuthBeanI;
import com.asule.app.model.entity.User;
import com.asule.database.Database;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(urlPatterns = "/login")
public class LoginAction extends BaseAction {

    AuthBeanI authBean = new AuthBean();

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        HttpSession httpSession = req.getSession();

        if (StringUtils.isNotBlank((String) httpSession.getAttribute("loggedInId")))
            resp.sendRedirect("./home");
        else
            resp.sendRedirect("./");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        User loginUser  = new User();
        serializeForm(loginUser, req.getParameterMap());

        User userDetails = authBean.authenticate(loginUser);

        if (userDetails != null) {
            HttpSession httpSession = req.getSession(true);

            httpSession.setAttribute("loggedInId", new Date().getTime() + "");
            httpSession.setAttribute("username", loginUser.getUsername());

            resp.sendRedirect("./home");

        }

        PrintWriter print = resp.getWriter();
        print.write("<html><body>Invalid login details <a href=\".\"> Login again </a></body></html>");

    }

}
