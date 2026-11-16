package com.itshaala.dao;

import com.itshaala.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

    public void addEmployee(Employee employee) {
        System.out.println("employee added");
    }

    public void deleteEmployee(Employee employee) {
        System.out.println("employee deleted");
    }

    public void updateEmployee(Employee employee) {
        System.out.println("employee updated");
    }

}
