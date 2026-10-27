package com.itshaala.dao;

import com.itshaala.model.Student;
import com.itshaala.util.DBUtil;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    @SneakyThrows
    public void addStudent(Student student) {
        Connection connection = DBUtil.getConnection();
        String query = "insert into student(name, phone, email) values(?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, student.getName());
        preparedStatement.setString(2, student.getPhone());
        preparedStatement.setString(3, student.getEmail());
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
        System.out.println("Student added successfully");
    }

    @SneakyThrows
    public void editStudent(Student student) {
        Connection connection = DBUtil.getConnection();
        String query = "update student set name=?, phone=?, email=? where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, student.getName());
        preparedStatement.setString(2, student.getPhone());
        preparedStatement.setString(3, student.getEmail());
        preparedStatement.setInt(4, student.getId());
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
        System.out.println("Student updated successfully");
    }

    @SneakyThrows
    public void deleteStudent(int id) {
        Connection connection = DBUtil.getConnection();
        String query = "delete from student where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
        System.out.println("Student deleted successfully");
    }

    @SneakyThrows
    public Student getStudent(int id) {
        Connection connection = DBUtil.getConnection();
        String query = "select * from student where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Student student = new Student();
        while (resultSet.next()) {
            student.setId(resultSet.getInt("id"));
            student.setName(resultSet.getString("name"));
            student.setPhone(resultSet.getString("phone"));
            student.setEmail(resultSet.getString("email"));
        }
        preparedStatement.close();
        connection.close();
        return student;
    }

    @SneakyThrows
    public List<Student> getAllStudents() {
        Connection connection = DBUtil.getConnection();
        String query = "select * from student";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Student> students = new ArrayList<>();
        while (resultSet.next()) {
            Student student = new Student();
            student.setId(resultSet.getInt("id"));
            student.setName(resultSet.getString("name"));
            student.setPhone(resultSet.getString("phone"));
            student.setEmail(resultSet.getString("email"));
            students.add(student);
        }
        preparedStatement.close();
        connection.close();
        return students;
    }

}
