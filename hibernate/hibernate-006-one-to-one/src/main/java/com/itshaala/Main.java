package com.itshaala;

import com.itshaala.dao.EmployeeDao;
import com.itshaala.model.Address;
import com.itshaala.model.Employee;

public class Main {
    public static void main(String[] args) {
        EmployeeDao dao = new EmployeeDao();
        Employee employee = new Employee();
        employee.setName("mayuresh");
        Address address = new Address();
        address.setCity("shanghai");
        address.setStreet("wang cho road");
        address.setCountry("China");

        employee.setAddress(address);
        dao.addEmployee(employee);


    }
}
