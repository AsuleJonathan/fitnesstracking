package com.asule.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Hello implements Servlet{

    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Unimplemented method 'destroy'");
    }

    @Override
    public ServletConfig getServletConfig() {
        throw new UnsupportedOperationException("Unimplemented method 'getServletConfig'");
    }

    @Override
    public String getServletInfo() {
        throw new UnsupportedOperationException("Unimplemented method 'getServletInfo'");
    }

    @Override
    public void init(ServletConfig arg0) throws ServletException {
        
        throw new UnsupportedOperationException("Unimplemented method 'init'");
    }

    @Override
    public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
       
        throw new UnsupportedOperationException("Unimplemented method 'service'");
    }
    
}
