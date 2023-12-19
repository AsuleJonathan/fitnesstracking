package com.asule.app.action.useractions;


import com.asule.app.action.BaseActionClass;
import com.asule.app.bean.userbean.BookMembershipI;
import com.asule.app.model.entity.BookMembership;
import com.asule.view.html.HtmlComponents;
import com.asule.view.html.HtmlUserPages;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/book")
public class BookMembershipAction extends BaseActionClass {

    @EJB
    BookMembershipI bookMembershipBean;

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws  ServletException, IOException{
        BookMembership newBookMembership = new BookMembership();
        serializeForm(newBookMembership, req.getParameterMap());

        bookMembershipBean.addOrUpdate(newBookMembership);

        res.sendRedirect("./Memberships");

    }
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        renderPage(req,res, HtmlUserPages.bookMembershipPage(HtmlComponents.MembershipForm(BookMembership.class) )
               );

    }
}
