package _13_File_Handling._03_chars_read_write;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4BufferedWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(" Good morning. Wake up");

        bufferedWriter.close();
        fileWriter.close();
        System.out.println("File written to " + file.getAbsolutePath());
    }
}
