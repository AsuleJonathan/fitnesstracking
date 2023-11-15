package com.asule.auth;
<<<<<<< HEAD

import com.asule.app.model.entity.User;
import com.asule.database.Database;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
=======
import javax.servlet.annotation.WebInitParam;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;
>>>>>>> b5ad14254e74ba71eeee429b12c13fad17f02132
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
<<<<<<< HEAD
=======
import java.lang.System.Logger.Level;

import org.apache.commons.lang3.StringUtils;

import com.asule.application.model.User;
import com.asule.database.Database;
import com.asule.utils.CustomLogger;

>>>>>>> b5ad14254e74ba71eeee429b12c13fad17f02132
import java.util.Date;

@WebServlet(urlPatterns = "/login", initParams = {
        @WebInitParam(name = "username", value = "asule"),
        @WebInitParam(name = "password", value = "asule123")
})
public class Login extends HttpServlet {

<<<<<<< HEAD
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        HttpSession httpSession = req.getSession();

        if (StringUtils.isNotBlank((String) httpSession.getAttribute("loggedInId")))
            resp.sendRedirect("./home");
        else
            resp.sendRedirect("./");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
=======
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();
        if (StringUtils.isNotBlank((String) httpSession.getAttribute("LoginId")))
            res.sendRedirect("/home");
        else
            res.sendRedirect("./");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        CustomLogger logger = CustomLogger.getLoggerInstance();
>>>>>>> b5ad14254e74ba71eeee429b12c13fad17f02132

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        Database database = Database.getDbInstance();

<<<<<<< HEAD
        System.out.println("what time was this database created: " + database.getDatabaseCreateAt());
=======
        System.out.println("What time was this db created: " + database.getDatabaseCreatedAt());
        logger.log(Level.INFO, "What time was this db created: " + database.getDatabaseCreatedAt());
>>>>>>> b5ad14254e74ba71eeee429b12c13fad17f02132

        for (User user : database.getUsers()) {
            if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                HttpSession httpSession = req.getSession(true);
<<<<<<< HEAD

                httpSession.setAttribute("loggedInId", new Date().getTime() + "");
                httpSession.setAttribute("username", username);

                resp.sendRedirect("./home");

            }
        }

        PrintWriter print = resp.getWriter();
        print.write("<html><body>Invalid login details <a href=\".\"> Login again </a></body></html>");

    }

}
=======
                httpSession.setAttribute("LoginId", new Date().getTime() + "");
                //implementing cookies
                Cookie newCookie = new Cookie("username", username);
                res.addCookie(newCookie);
                //sending data -> another servlet
                httpSession.setAttribute("username", username);
                res.sendRedirect("./home");
                // res.sendRedirect("./app/home.html");
            }
        }

        //getInitParams - accessing servlet config
        //getParams - getting client request data
        //context(initialized servletContext) - context.getInitParams - servlet context
        PrintWriter print = res.getWriter();

        print.write("<html><body>Invalid credentials! <a href=\".\"> Login again </a></body></html>");
    }


}


    
    

>>>>>>> b5ad14254e74ba71eeee429b12c13fad17f02132
