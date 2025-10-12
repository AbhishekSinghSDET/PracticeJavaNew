package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {
        //Write Content to File

        File myFile = new File("def.txt");
        FileWriter fw = null;

        try {
             fw = new FileWriter(myFile,true);
             fw.write("Hello I am writing into the file from java code 2");
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
