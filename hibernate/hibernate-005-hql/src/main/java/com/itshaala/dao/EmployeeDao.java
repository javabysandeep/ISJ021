package com.itshaala.dao;

import com.itshaala.model.Employee;
import com.itshaala.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
    public void addEmployee(Employee employee) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.persist(employee);
            tx.commit();
        }
        //HibernateUtil.shutdown();
        System.out.println("Employee added successfully");
    }

    public void updateCity(Employee employee) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            Employee e = session.find(Employee.class, employee.getId());
            e.setCity(employee.getCity());
            tx.commit();
        }
        //HibernateUtil.shutdown();
        System.out.println("Employee added successfully");
    }

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            employees = session.createQuery("from Employee").list();
        }
        return employees;
    }
}
