package com.asule.app.action;

import com.asule.app.bean.WorkoutBeanI;
import com.asule.app.model.Workout;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/workout")
public class WorkoutAction extends BaseAction {

    @EJB
    private WorkoutBeanI workoutBean;

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        renderPage(req, resp, 4, Workout.class, workoutBean.list(new Workout()));

    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        workoutBean.addOrUpdate(serializeForm(Workout.class, req.getParameterMap()));

        resp.sendRedirect("./workout");

    }
}
