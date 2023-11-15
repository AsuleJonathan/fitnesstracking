package com.asule.app.action;

import com.asule.app.bean.MemberBean;
import com.asule.app.bean.MemberBeanI;
import com.asule.app.model.entity.Member;
import com.asule.database.Database;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@WebServlet("/members")
public class MembersAction extends HttpServlet {

    private MemberBeanI memberBean = new MemberBean();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        displayMemberTable(response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form parameters
        String memberId = request.getParameter("Id");
        String memberName = request.getParameter("name");
        String memberWeight = request.getParameter("weight");
        String memberNotes = request.getParameter("notes");
        

        // Create a Member object
        Member member = new Member(memberId, memberName, memberWeight, memberNotes);

        // Add or update member using MemberBean
        memberBean.addOrUpdateMember(member);

        // Redirect to the member details table page
        response.sendRedirect(request.getContextPath() + "/members");
    }

    private void displayMemberTable(HttpServletResponse response) throws IOException {
        // Retrieve the list of members from the database
        List<Member> members = Database.getDbInstance().getMembers();

        // Generate HTML for the table
        StringBuilder tableHtml = new StringBuilder();
        tableHtml.append("<html><head><title>Member Details</title></head><body>");
        tableHtml.append("<h1>Member Details</h1>");
        tableHtml.append("<table border='1'>");
        tableHtml.append("<tr><th>ID</th><th>Name</th><th>Weight</th><th>Notes</th></tr>");

        for (Member member : members) {
            tableHtml.append("<tr>");
            tableHtml.append("<td>").append(member.getId()).append("</td>");
            tableHtml.append("<td>").append(member.getName()).append("</td>");
            tableHtml.append("<td>").append(member.getWeight()).append("</td>");
            tableHtml.append("<td>").append(member.getNotes()).append("</td>");
            tableHtml.append("</tr>");
        }

        tableHtml.append("</table></body></html>");

        // Write the HTML to the response
        response.setContentType("text/html");
        response.getWriter().write(tableHtml.toString());
    }
}


