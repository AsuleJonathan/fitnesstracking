package com.asule.app.action.adminactions;

import com.asule.app.action.BaseActionClass;
import com.asule.app.bean.sharedbean.UserBeanImpl;
import com.asule.app.bean.userbean.UserBeanI;
import com.asule.app.model.entity.User;
import com.asule.view.html.HtmlAdminPages;
import com.asule.view.html.HtmlComponents;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/adminusers")
public class AdminUserReportAction extends BaseActionClass {
    @EJB
    UserBeanI userBean;
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        renderAdminPage(req, res, HtmlAdminPages.adminUserReport(HtmlComponents.table(User.class,userBean.list(User.class) ))
             );

        //testing for single item
//        StringBuilder test = new StringBuilder();
//
//        renderAdminPage(req, res,test.append("one data - for static id 1 - ").append ( userBean.selectSingle(User.class,1)
//        ).toString());

    }
}
