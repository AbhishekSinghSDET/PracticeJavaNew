package exceptionandfilehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

    public static void main(String[] args) {
        //Read demo.txt file and print the content of it on console

        File file = new File("demo.txt"); // batao file kidr hai pehle
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        String data = null;

        try {
             fileReader = new FileReader(file); // Need reader to read file
             bufferedReader = new BufferedReader(fileReader); // need to read file line by line
             data = bufferedReader.readLine();
            System.out.println(data);
        }

        catch (IOException e ){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
