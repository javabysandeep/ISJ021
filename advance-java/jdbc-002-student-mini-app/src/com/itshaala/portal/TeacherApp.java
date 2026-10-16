package com.itshaala.portal;

import com.itshaala.portal.model.Teacher;

public class TeacherApp {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "Sandeep", 100);
        System.out.println(teacher);
        System.out.println(teacher.id());
        System.out.println(teacher.name());
        System.out.println(teacher.salary());

        Teacher teacher2 = new Teacher(1, "Sandeep", 100);

        System.out.println(teacher.hashCode() == teacher2.hashCode());
    }
}
