package _13_File_Handling._01_file_class;

import java.io.File;

public class Demo6FilePathLength {
    public static void main(String[] args) {
        File file = new File("abc.txt");
        System.out.println("file length = "+file.length());
        System.out.println("file absolute path = "+file.getAbsolutePath());
        System.out.println("file relative path = "+file.getPath());
    }
}
