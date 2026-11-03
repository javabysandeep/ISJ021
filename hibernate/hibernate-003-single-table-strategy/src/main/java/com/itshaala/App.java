package com.itshaala;

import com.itshaala.dao.EmployeeDao;
import com.itshaala.model.ContractEmployee;
import com.itshaala.model.Employee;
import com.itshaala.model.FullTimeEmployee;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
       /* Employee employee = Employee.builder()
                .name("Samrat")
                .address("Pune")
                .build();*/
        /*FullTimeEmployee employee = new FullTimeEmployee();
        employee.setName("Saloni");
        employee.setSalary(5000);
        employee.setAddress("Deccan");*/

        ContractEmployee employee = new ContractEmployee();
        employee.setName("Shravani");
        employee.setInvoiceAmount(10000);
        employee.setAddress("Mumbai");


        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.addEmployee(employee);

    }
}
