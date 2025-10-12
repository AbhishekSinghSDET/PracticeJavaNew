package exceptionandfilehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingOptimized {

    public static void main(String[] args) {
        //Read demo.txt file and print the content of it on console

        File file = new File("demo.txt"); // batao file kidr hai pehle
        FileReader fileReader;
        String data = null;

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
             data = bufferedReader.readLine();
        }
        
        catch (IOException e ){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println(data);
    }
}
