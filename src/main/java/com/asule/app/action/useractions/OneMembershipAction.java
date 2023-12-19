package com.asule.app.action.useractions;


import com.asule.app.action.BaseActionClass;
import com.asule.view.html.HtmlUserPages;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/Membershipdetails")
public class OneMembershipAction extends BaseActionClass {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

     renderPage(req, res, HtmlUserPages.MembershipDetailsPage());

    }
}