package com.asule.app.action.adminactions;

import com.asule.app.action.BaseActionClass;
import com.asule.app.bean.adminbean.AdminMembershipManagementI;
import com.asule.app.bean.adminbean.AdminMembershipManagementBeanImpl;
import com.asule.app.model.entity.MembershipManagement;
import com.asule.database.Database;
import com.asule.view.html.HtmlAdminPages;
import com.asule.view.html.HtmlComponents;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/adminMembershippricing")
public class AdminMembershipManageAction extends BaseActionClass {

    @EJB
    AdminMembershipManagementI adminMembershipManagementBean;

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        MembershipManagement newMembership = new MembershipManagement();

        serializeForm(newMembership, req.getParameterMap());

        adminMembershipManagementBean.addOrUpdate(newMembership);

        res.sendRedirect("./adminMembershippricing");
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        renderAdminPage(req, res, HtmlAdminPages.adminMembershipManageListPage(HtmlComponents.table(MembershipManagement.class, adminMembershipManagementBean.list(MembershipManagement.class)))
        );

    }
}
