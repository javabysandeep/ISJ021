package com.itshaala.servlets;

import com.itshaala.controller.StudentController;
import com.itshaala.model.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/students")
public class GetAllStudentsServlet extends HttpServlet {
    private StudentController studentController = new StudentController();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> studentList = studentController.getAllStudents();
        resp.getWriter().println(studentList.toString());
    }
}
