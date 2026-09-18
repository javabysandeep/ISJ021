package _13_File_Handling._03_chars_read_write;

import java.io.*;

public class Demo2BufferedReader {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Work\\ISJ021\\core-java\\src\\_12_multithreading\\Demo7RaceCondition.java");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int value = bufferedReader.read();

        while (value != -1) {
            System.out.print((char) value);
            value = bufferedReader.read();
        }
        bufferedReader.close();
        fileReader.close();

    }
}
