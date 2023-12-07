package com.asule.app.action;

import com.asule.app.bean.FitnessBeanI;
import com.asule.app.model.Fitness;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/fitnesss")
public class FitnessAction extends BaseAction {

    @EJB
    FitnessBeanI fitnessBean;

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        renderPage(req, resp, 2, Fitness.class, fitnessBean.list(new Fitness()));

    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        fitnessBean.addOrUpdate(serializeForm(Fitness.class, req.getParameterMap()));

        resp.sendRedirect("./fitnesss");

    }
}
