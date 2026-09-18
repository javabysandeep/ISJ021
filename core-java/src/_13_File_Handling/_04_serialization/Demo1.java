package _13_File_Handling._04_serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        File file = new File("student-details.txt");
        Student student = new Student(1, "sandeep", "abc");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(student);
        oos.close();
        fos.close();
        System.out.println("Serialized data is saved to " + file.getAbsolutePath());
    }
}
