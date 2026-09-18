package _13_File_Handling._01_file_class;

import java.io.File;

public class Demo9FileObjectList {
    public static void main(String[] args) {
        File folder = new File("C:\\Work\\ISJ021\\core-java\\src\\_03_control_statements\\_01_conditional");

        File[] fileArray = folder.listFiles();

        for (File file : fileArray) {
            System.out.println(file.getName() + "\t" + file.length());
        }
    }
}
