package com.asule.home;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class Home extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String homeInfo = (String) req.getAttribute("homeInfo");

        PrintWriter print = resp.getWriter();
        print.write("<html><body><a href=\".\"> " + homeInfo + "</a></body></html>");

    }

    
}
