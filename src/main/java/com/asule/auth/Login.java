
package com.asule.auth;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class Login extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        PrintWriter print = resp.getWriter();

        if (username.equals("asule") && password.equals("123"))
            print.write("Welcome to Ajay Fitness");
        else
            print.write("<html><body>Invalid login details <a href=\".\"> Login again </a></body></html>");
    }
}

    
    

