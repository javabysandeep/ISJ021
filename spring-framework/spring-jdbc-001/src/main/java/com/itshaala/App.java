package com.itshaala;

import com.itshaala.configuration.SpringConfiguration;
import com.itshaala.controller.StudentController;
import com.itshaala.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        StudentController studentController = context.getBean(StudentController.class);

        Student student = new Student();
        student.setName("Diksha");
        student.setEmail("diksha@gmail.com");
        student.setPhone("123");
        //studentController.addStudent(student);
        System.out.println(studentController.getStudentById(19));
    }
}
