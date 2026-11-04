package com.itshaala;

import com.itshaala.dao.EmployeeDao;
import com.itshaala.model.Employee;

public class Main {
    public static void main(String[] args) {
        EmployeeDao dao = new EmployeeDao();
        Employee employee = new Employee();
        employee.setId(52);
        employee.setCity("Uganda");
        //no update call : dirty checking does it
        dao.updateCity(employee);
        //dao.getAllEmployees().forEach(System.out::println);
    }
}
