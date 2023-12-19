package com.asule.app.action.adminactions;

import com.asule.app.action.BaseActionClass;
import com.asule.view.html.HtmlAdminPages;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/adminMembershipreport")
public class AdminMembershipReportAction extends BaseActionClass {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        renderAdminPage(req, res, HtmlAdminPages.adminMemberReport());
    }
}
