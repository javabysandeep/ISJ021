package _13_File_Handling._01_file_class;

import java.io.File;

public class Demo7FileNameList {
    public static void main(String[] args) {
        File folder = new File("C:\\Work\\ISJ021\\core-java\\src\\_03_control_statements\\_01_conditional");

        String[] fileNamesArray = folder.list();

        for (String fileName : fileNamesArray) {
            System.out.println(fileName);
        }
    }
}
