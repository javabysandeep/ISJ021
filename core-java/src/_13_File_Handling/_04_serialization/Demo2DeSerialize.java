package _13_File_Handling._04_serialization;

import java.io.*;

public class Demo2DeSerialize {
    public static void main(String[] args) throws Exception {
        File file = new File("student-details.txt");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student student = (Student) ois.readObject();
        ois.close();
        fis.close();

        System.out.println(student);
    }
}
