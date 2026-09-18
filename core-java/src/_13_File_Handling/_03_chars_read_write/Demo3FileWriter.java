package _13_File_Handling._03_chars_read_write;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3FileWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write(" Good morning. Wake up");
        fileWriter.close();
        System.out.println("File written to " + file.getAbsolutePath());
    }
}
