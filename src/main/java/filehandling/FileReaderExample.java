package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        File myFile = new File("def.txt");
        int data = 0;
        try {
            FileReader fr = new FileReader(myFile);
            while (data!=-1) {
                data = fr.read();
                System.out.print((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
