package com.itshaala.service;

import com.itshaala.dao.StudentDao;
import com.itshaala.model.Student;

import java.util.List;

public class StudentService {
    private StudentDao studentDao = new StudentDao();

    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    public void editStudent(Student student) {
        studentDao.editStudent(student);
    }

    public void deleteStudent(int id) {
        studentDao.deleteStudent(id);
    }

    public Student getStudentById(int id) {
        return studentDao.getStudent(id);
    }

    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

}
