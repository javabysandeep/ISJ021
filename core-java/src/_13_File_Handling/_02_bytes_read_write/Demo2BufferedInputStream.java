package _13_File_Handling._02_bytes_read_write;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo2BufferedInputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Work\\ISJ021\\core-java\\src\\_12_multithreading\\Demo7RaceCondition.java");
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        int value = bis.read();

        while (value != -1) {
            System.out.print((char) value);
            value = bis.read();
        }
        bis.close();
        fis.close();

    }
}
