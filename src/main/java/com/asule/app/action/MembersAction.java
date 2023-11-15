package com.asule.app.action;

import com.asule.app.bean.MemberBean;
import com.asule.app.bean.MemberBeanI;
import com.asule.app.model.entity.Member;
import com.asule.database.Database;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.math.BigDecimal;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

@WebServlet("/members")
public class MembersAction extends HttpServlet {

    private MemberBeanI memberBean = new MemberBean();

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();

        // Change accountBean to memberBean
        memberBean.addOrUpdateMember(new Member(req.getParameter("number"),
            req.getParameter("name"), BigDecimal.ZERO));

        resp.sendRedirect("./home");
    }
}
