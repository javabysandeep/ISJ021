package _13_File_Handling._02_bytes_read_write;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3FileOutputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        fileOutputStream.write(" Hi World".getBytes());
        fileOutputStream.close();
        System.out.println("File written to " + file.getAbsolutePath());
    }
}
