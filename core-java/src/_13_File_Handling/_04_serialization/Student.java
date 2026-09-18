package _13_File_Handling._04_serialization;

import java.io.Serializable;

public class Student implements Serializable {
    int id;
    String username;
   transient String password;

    public Student(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
