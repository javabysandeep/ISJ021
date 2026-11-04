package com.itshaala;

import com.itshaala.dao.EmployeeDao;
import com.itshaala.model.Address;
import com.itshaala.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeDao dao = new EmployeeDao();
        Employee employee = new Employee();
        employee.setName("mayuresh");
        Address address1 = new Address();
        address1.setCity("shanghai");
        address1.setStreet("wang cho road");
        address1.setCountry("China");

        Address address2 = new Address();
        address2.setCity("Shenzhen");
        address2.setStreet("central park");
        address2.setCountry("China");

        List<Address> addresses = new ArrayList<>();
        addresses.add(address1);
        addresses.add(address2);
        employee.setAddresses(addresses);
        dao.addEmployee(employee);


    }
}
