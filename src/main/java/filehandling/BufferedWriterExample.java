package filehandling;

import java.io.*;

public class BufferedWriterExample {

    public static void main(String[] args) {
        File file = new File("def.txt");

        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(file,true);
            bw= new BufferedWriter(fw);
            bw.write("\nHello my name is Abhishek 1");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
