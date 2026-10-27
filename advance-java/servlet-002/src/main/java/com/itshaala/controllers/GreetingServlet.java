package com.itshaala.controllers;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet(value = "/greet", loadOnStartup = 1)
public class GreetingServlet implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("com.itshaala.controllers.GreetingServlet init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("com.itshaala.controllers.GreetingServlet service");
        res.getWriter().println("Greetings of the day .... " + LocalDateTime.now());
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {
        System.out.println("com.itshaala.controllers.GreetingServlet destroy");
    }
}
