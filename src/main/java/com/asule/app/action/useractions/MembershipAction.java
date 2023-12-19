package com.asule.app.action.useractions;

import com.asule.app.action.BaseActionClass;
import com.asule.app.bean.userbean.BookMembershipI;
import com.asule.app.model.entity.BookMembership;
import com.asule.view.html.HtmlComponents;
import com.asule.view.html.HtmlUserPages;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/Memberships")
public class MembershipAction extends BaseActionClass {

    @EJB
    BookMembershipI bookMembershipBean;

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        BookMembership newMembership = new BookMembership();

        bookMembershipBean.addOrUpdate(newMembership);

        res.sendRedirect("./Memberships");
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            renderPage(req, res , HtmlComponents.bookMembershipCard(BookMembership.class, bookMembershipBean.list(BookMembership.class)));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}