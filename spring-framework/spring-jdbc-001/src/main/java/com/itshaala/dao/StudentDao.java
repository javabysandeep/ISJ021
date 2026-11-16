package com.itshaala.dao;

import com.itshaala.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void addStudent(Student student) {
        String query = "insert into student(name, email, phone) values (?, ?,  ?)";
        jdbcTemplate.update(query, student.getName(), student.getEmail(), student.getPhone());
        System.out.println("student record created");
    }

    public void updateStudent(Student student) {
        String query = "update student set name=?, email=?, phone=? where id=?";
        jdbcTemplate.update(query, student.getName(), student.getEmail(), student.getPhone(), student.getId());
        System.out.println("student record updated");
    }

    public void deleteStudentById(int id) {
        String query = "delete from student where id=?";
        jdbcTemplate.update(query, id);
        System.out.println("student record deleted");
    }

    public Student getStudentById(int id) {
        String query = "select * from student where id=?";
        return jdbcTemplate.queryForObject(query, Student.class, id);
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        String query = "select * from student";
        return students;
    }

}
