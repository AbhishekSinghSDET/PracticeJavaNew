package filehandling;

import oops.inheritance.B;

import java.io.*;

public class BufferedReaderExample {

    public static void main(String[] args) {
        File file = new File("def.txt");
        FileReader fr = null;
        BufferedReader br = null;
        String line;

        try {
             fr = new FileReader(file);
             br = new BufferedReader(fr);
             while((line = br.readLine())!=null) {
                 System.out.println(line);
             }
             br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
