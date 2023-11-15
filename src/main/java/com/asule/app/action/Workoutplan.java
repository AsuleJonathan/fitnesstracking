package com.asule.app.action;

import com.asule.app.view.html.AppPage;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("workoutplan")
public class Workoutplan extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();

        new AppPage().renderHtml(req, resp, 3,
                "<h2>Workoutplan </h2> WorkOut plan will be displayed here");

    }
}
