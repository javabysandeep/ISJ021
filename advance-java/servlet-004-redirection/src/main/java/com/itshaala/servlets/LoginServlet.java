package com.itshaala.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (username.equals("admin") && password.equals("admin")) {
            RequestDispatcher rd = req.getRequestDispatcher("welcome");
            rd.forward(req, resp);
        } else {
            resp.setContentType("text/html;charset=UTF-8");
            resp.getWriter().println("Wrong username or password");
            RequestDispatcher rd = req.getRequestDispatcher("login.html");
            rd.include(req, resp);
        }
    }
}
