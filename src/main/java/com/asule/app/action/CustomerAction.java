package com.asule.app.action;

import com.asule.app.model.entity.Customer;
import com.asule.app.view.html.AppPage;
import com.asule.app.view.html.HtmlComponent;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("customers")
public class CustomerAction extends BaseAction{

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();

        new AppPage().renderHtml(req, resp, 1,
                HtmlComponent.form(Customer.class));

    }
}
