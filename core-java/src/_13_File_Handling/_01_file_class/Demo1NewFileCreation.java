package _13_File_Handling._01_file_class;

import java.io.File;
import java.io.IOException;

public class Demo1NewFileCreation {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Work\\file-handling-temp\\abc.txt");
        System.out.println("file created : "+file.createNewFile());
    }
}
