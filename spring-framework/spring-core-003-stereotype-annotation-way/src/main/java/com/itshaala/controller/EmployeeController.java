package com.itshaala.controller;

import com.itshaala.model.Employee;
import com.itshaala.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService ;

    public void addEmployee(Employee employee) {
        employeeService.addEmployee(employee);
    }

    public void deleteEmployee(Employee employee) {
        employeeService.deleteEmployee(employee);
    }

    public void updateEmployee(Employee employee) {
        employeeService.updateEmployee(employee);
    }


}
