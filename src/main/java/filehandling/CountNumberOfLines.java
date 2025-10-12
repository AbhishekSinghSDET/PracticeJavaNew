package filehandling;

import oops.inheritance.B;

import java.io.*;

public class CountNumberOfLines {

    //Here we count total number of lines, total number of characters

    public static void main(String[] args) {
        File file = new File("countlines.txt");
        FileReader fr = null;
        BufferedReader br = null;
        String line;
        int totalLines = 0;
        int totalNoOfChar = 0;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            while((line=br.readLine())!=null){
                System.out.println(line);
                totalLines++;
                totalNoOfChar = totalNoOfChar + line.length();
            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Total Number of lines: "+totalLines);
        System.out.println("Total Number of Characters: "+totalNoOfChar);
    }
}
