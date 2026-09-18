package _13_File_Handling._01_file_class;

import java.io.File;
import java.io.IOException;

public class Demo4NewFileLoop {
    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 100; i++) {
            File file = new File("C:\\Work\\file-handling-temp\\" + i + ".txt");
            file.createNewFile();
        }
        System.out.println("files created");
    }
}
