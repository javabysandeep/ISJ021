package com.itshaala.portal;

import com.itshaala.portal.controller.StudentController;
import com.itshaala.portal.model.Student;

public class App {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        Student student = new Student();
        student.setId(3);
        student.setName("Ayan");
        student.setAddress("Kolkata");
        student.setEmail("ayan@gmail.com");
        student.setPhone("8989889");

        //studentController.addStudent(student);
       // studentController.updateStudent(student);
        //studentController.deleteStudentById(3);
        //System.out.println(studentController.getStudentById(2));
        System.out.println(studentController.getAllStudents());

    }
}
