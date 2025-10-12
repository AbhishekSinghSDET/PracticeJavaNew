package exceptionandfilehandling;

import java.io.*;
import java.nio.Buffer;

public class CopyContentFile {

    public static void main(String[] args) {
        File file = new File("demo.txt");
        File destFile = new File("dest.txt");
        String line;

        try(BufferedReader br = new BufferedReader(new FileReader(file));
            BufferedWriter bw = new BufferedWriter(new FileWriter(destFile))
        ){
            while((line=br.readLine())!=null){
                System.out.println(line);
                bw.write(line);
                bw.newLine();   // it means hitting ENTER KEY
            }
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
