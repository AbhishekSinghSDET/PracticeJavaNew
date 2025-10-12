package filehandling;

import java.io.File;

public class FileRunner2 {

    public static void main(String[] args) {

        File file = new File("def.txt");
        System.out.println("FileName: "+file.getName());
        System.out.println("File Path: "+file.getAbsolutePath());
        System.out.println("Is it file: "+file.isFile());
        System.out.println("Is it Directory: "+file.isDirectory());

        //Create directory
        File logDirectory = new File("logs");
        logDirectory.mkdir();
        System.out.println("Is it directory: "+logDirectory.isDirectory());

        //Checking permission for a file
        System.out.println("Can read file: "+file.canRead());
        System.out.println("Can write file: "+file.canWrite());
        System.out.println("Can execute file: "+file.canExecute());
        System.out.println("Find Parent: "+file.getParent());
        System.out.println("File Size: "+file.length()); //will get in bytes
    }
}
