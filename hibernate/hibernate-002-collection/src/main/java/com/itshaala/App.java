package com.itshaala;

import com.itshaala.dao.EmployeeDao;
import com.itshaala.model.Employee;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Employee employee = Employee.builder()
                .name("Sandeep")
                .address("Pune")
                .hobbies(List.of("gyan dena", "bacho ko free me gyan dena"))
                .build();

        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.addEmployee(employee);

    }
}
