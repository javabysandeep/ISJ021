package com.itshaala;

import com.itshaala.config.SpringConfiguration;
import com.itshaala.controller.EmployeeController;
import com.itshaala.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);

        EmployeeController employeeController = context.getBean(EmployeeController.class);

        employeeController.addEmployee(new Employee());

    }
}
