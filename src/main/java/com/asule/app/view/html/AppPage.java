package com.asule.app.view.html;

import com.asule.app.bean.MemberBean;
import com.asule.app.bean.MemberBeanI;
import com.asule.app.view.css.AppCss;
import com.asule.app.view.toolbar.TopToolbar;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

public class AppPage implements Serializable {

    public void renderHtml(HttpServletRequest req, HttpServletResponse resp,
       int activeMenu, String content) throws IOException {

        HttpSession session = req.getSession();

        ServletContext ctx = req.getServletContext();

        PrintWriter print = resp.getWriter();

        print.write("<!DOCTYPE html>" +
            "<html>" +

            "<head>" +
                new AppCss().getStyle() +
            "</head>" +

            "<body>" +

            new TopToolbar().menu(activeMenu) +

            "<h3>" + ctx.getInitParameter("AppName") + "<h3>" +
            "<br/>&nbsp;<br/>" +
            "<h3>Welcome: " + session.getAttribute("username") + "</h3> | Authenticated At "
                + resp.getHeader("AuthTime") + "<br/>");

        print.write(content);
        print.write("<a href=\"./logout\">Logout</a>" +
            "</body>" +
            "</html>");


    }
}
