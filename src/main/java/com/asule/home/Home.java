package com.asule.home;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class Home extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        ServletContext ctx = getServletContext();

    PrintWriter print = resp.getWriter();
         print.write("<!DOCTYPE html>\n" +
            "<html>\n" +
            "<head>\n" +
            "    <style>\n" +
            "table {\n" +
            "  font-family: arial, sans-serif;\n" +
            "  border-collapse: collapse;\n" +
            "  width: 100%;\n" +
            "}\n" +
            "\n" +
            "td, th {\n" +
            "  border: 1px solid #dddddd;\n" +
            "  text-align: left;\n" +
            "  padding: 8px;\n" +
            "}\n" +
            "\n" +
            "tr:nth-child(even) {\n" +
            "  background-color: #dddddd;\n" +
            "}\n" +
            "</style>\n" +
            "</head>\n" +
            "<body>\n" +
                "Welcome: " + ctx.getAttribute("username") + "<br/>" +
                 ctx.getInitParameter("AppName") + "<br/>" +
            "\n" +
            "<h2>weight tracking</h2>\n");
      
        print.write("\n" +
                "Server Info: " + ctx.getServerInfo() + "<br/>" +
                "Application Deployment Location" + ctx.getRealPath(ctx.getContextPath()) + "<br/>" +
                "</body>\n" +
                "</html>");


    }
}