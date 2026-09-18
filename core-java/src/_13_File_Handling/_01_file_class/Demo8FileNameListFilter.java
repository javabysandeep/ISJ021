package _13_File_Handling._01_file_class;

import java.io.File;
import java.io.FilenameFilter;

public class Demo8FileNameListFilter {
    public static void main(String[] args) {
        File folder = new File("C:\\Work\\ISJ021\\core-java\\src\\_03_control_statements\\_01_conditional");

        FilenameFilter fileNameFilter = (dir, name)->name.startsWith("Demo1");
        String[] fileNamesArray = folder.list(fileNameFilter);

        for (String fileName : fileNamesArray) {
            System.out.println(fileName);
        }
    }
}
