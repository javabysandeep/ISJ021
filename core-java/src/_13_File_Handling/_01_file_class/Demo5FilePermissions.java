package _13_File_Handling._01_file_class;

import java.io.File;
import java.io.IOException;

public class Demo5FilePermissions {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        file.setWritable(true);
        System.out.println("file permissions :"+file.canWrite());
    }
}
