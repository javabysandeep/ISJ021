package _13_File_Handling._01_file_class;

import java.io.File;
import java.io.FileFilter;

public class Demo10FileObjectListFilter {
    public static void main(String[] args) {
        File folder = new File("C:\\Work\\ISJ021\\core-java\\src\\_03_control_statements\\_01_conditional");

        FileFilter filter = (pathname)->pathname.getName().startsWith("Demo1");
        File[] fileArray = folder.listFiles(filter);

        for (File file : fileArray) {
            System.out.println(file.getName() + "\t" + file.length());
        }
    }
}
