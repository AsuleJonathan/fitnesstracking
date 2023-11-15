package com.asule.app.action;



import com.asule.app.model.entity.Workout;
import com.asule.app.view.html.AppPage;
import com.asule.app.view.html.HtmlComponent;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("./workout")
public class WorkoutAction extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        HttpSession httpSession = req.getSession();

        new AppPage().renderHtml(req, resp, 1,
                HtmlComponent.form(Workout.class) + HtmlComponent.table(new ArrayList<WorkoutAction>()));

    }
}
