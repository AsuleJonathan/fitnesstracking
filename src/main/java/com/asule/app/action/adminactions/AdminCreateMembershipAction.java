package com.asule.app.action.adminactions;

import com.asule.app.action.BaseActionClass;
import com.asule.app.bean.adminbean.MemberAdminBeanImpl;
import com.asule.app.bean.sharedbean.MemberBeanI;
import com.asule.app.model.entity.Member;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/adminMembership")
public class AdminCreateMembershipAction extends BaseActionClass {


    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        renderAdminPage(req, res, "    <div class=\"formMainContainer\">\n" +
                "      <div class=\"createMemberContainer\">\n" +
                "        <p class=\"MemberTitle\">Manage Membership for upcoming Member</p>\n" +
                "\n" +
                "        <form action=\"./adminMembershippricing\" method=\"post\">\n" +
                "          <div class=\"formContainer\">\n" +
                "            <div class=\"formInput\">\n" +
                "                <label for=\"MemberType\">Member Type:</label>\n" +
                "                <select name=\"MemberType\" id=\"MemberType\" class=\"MemberStyling\">\n" +
                "                  <option value=\"\" selected disabled hidden>Choose Member type</option>\n" +
                "                  <option value=\"Kenya Premier League\">Kenya Premier League</option>\n" +
                "                  <option value=\"Mozzart Cup\">Mozzart Cup</option>\n" +
                "                  <option value=\"CAF Champions League\">CAF Champions League</option>\n" +
                "                  <option value=\"CAF confederation\">CAF confederation</option>\n" +
                "                </select>\n" +
                "              </div>\n" +
                "            <div class=\"formInput\">\n" +
                "              <label for=\"totalMembershipsAllocated\">Total Memberships Allocated:</label>\n" +
                "              <input type=\"number\" name=\"totalMembershipsAllocated\" id=\"totalMembershipsAllocated\" />\n" +
                "            </div>\n" +
                "            \n" +
                "            <div class=\"formInput\">\n" +
                "              <label for=\"totalVipMembershipsLocated\">Total VIP Memberships:</label>\n" +
                "              <input type=\"number\" name=\"totalVipMembershipsLocated\" id=\"totalVipMembershipsLocated\" />\n" +
                "            </div>\n" +
                "            <div class=\"formInput\">\n" +
                "              <label for=\"MembershipAmountVIP\">VIP Membership amount:</label>\n" +
                "              <input type=\"number\" name=\"MembershipAmountVIP\" id=\"MembershipAmountVIP\" />\n" +
                "            </div>\n" +
                "            <div class=\"formInput\">\n" +
                "              <label for=\"totalNormalMembershipsAllocated\">Total Normal Memberships:</label>\n" +
                "              <input type=\"number\" name=\"totalNormalMembershipsAllocated\" id=\"totalNormalMembershipsAllocated\" />\n" +
                "            </div>\n" +
                "            <div class=\"formInput\">\n" +
                "              <label for=\"MembershipAmountNormal\">Normal Membership amount:</label>\n" +
                "              <input type=\"number\" name=\"MembershipAmountNormal\" id=\"MembershipAmountNormal\" />\n" +
                "            </div>\n" +
                "          \n" +
                "          </div>\n" +
                "          <input class=\"normalFormButton\" type=\"submit\" value=\"Submit\" />\n" +
                "        </form>\n" +
                "      </div>\n" +
                "    </div>");

    }
}
