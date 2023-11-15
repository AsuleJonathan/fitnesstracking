package com.asule.app.action;

import com.asule.app.bean.UserBean;
import com.asule.app.bean.UserBeanI;
import com.asule.app.model.entity.User;
import com.asule.database.Database;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user")
public class UserAction extends BaseAction {

    UserBeanI userBean = new UserBean();

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User registerUser = new User();
        serializeForm(registerUser, req.getParameterMap());

        userBean.register(registerUser);

        resp.sendRedirect("./");


    }
}
