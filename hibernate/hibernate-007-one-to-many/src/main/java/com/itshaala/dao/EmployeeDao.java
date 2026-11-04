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


}
