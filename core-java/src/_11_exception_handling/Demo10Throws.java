package _11_exception_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo10Throws {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("\\abc.txt");
        FileInputStream fis = new FileInputStream(file);
    }
}
