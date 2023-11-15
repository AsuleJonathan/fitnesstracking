package com.asule.auth;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

<<<<<<< HEAD
@WebServlet(urlPatterns = "/logout")
public class Logout  extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().invalidate();
        resp.sendRedirect("./");
=======

@WebServlet(urlPatterns = "/logout")
public class Logout extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        req.getSession().invalidate();
        res.sendRedirect("./");
>>>>>>> b5ad14254e74ba71eeee429b12c13fad17f02132
    }
}
