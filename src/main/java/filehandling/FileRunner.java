package filehandling;

import java.io.File;
import java.io.IOException;

public class FileRunner {
    public static void main(String[] args) {

        //check if file is present or not
        File file = new File("demo.txt");

        File newFile = new File("abc.txt");
        try {
            if(newFile.createNewFile()){
                System.out.println("File created "+newFile.getName());
            }
            else {
                System.out.println("File Already exist");
            }
        } catch (IOException e) {
            System.out.println(newFile.getName()+" File cannot be created");
            e.printStackTrace();
        }
        //System.out.println(isPresent);

        if(file.exists()){
            System.out.println(file.getName()+"File is Present");
            System.out.println("File path: "+file.getAbsolutePath());
        }
        else {
            System.out.println(file.getName()+"File is not Present");
        }

        //Delete file
        if(newFile.delete()){
            System.out.println(newFile.getName()+" File Deleted Successfully");
        }
        else {
            System.out.println("File cannot be deleted as it is not present");
        }
    }
}
