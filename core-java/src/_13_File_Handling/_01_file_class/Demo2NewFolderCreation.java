package _13_File_Handling._01_file_class;

import java.io.File;
import java.io.IOException;

public class Demo2NewFolderCreation {
    public static void main(String[] args) throws IOException {
        File folder = new File("C:\\Work\\file-handling-temp\\18SEPT2026");
        System.out.println("folder created : "+folder.mkdir());
    }
}
