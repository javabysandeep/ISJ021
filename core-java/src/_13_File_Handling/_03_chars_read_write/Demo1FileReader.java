package _13_File_Handling._03_chars_read_write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Demo1FileReader {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Work\\ISJ021\\core-java\\src\\_12_multithreading\\Demo7RaceCondition.java");
        FileReader fileReader = new FileReader(file);
        int value = fileReader.read();

        while (value != -1) {
            System.out.print((char) value);
            value = fileReader.read();
        }
        fileReader.close();

    }
}
