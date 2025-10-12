package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FindLongestWordInFile {

    //Here we count total number of lines, total number of characters

    public static void main(String[] args) {
        File file = new File("countlines.txt");
        FileReader fr = null;
        BufferedReader br = null;
        String line;
        String largestWord="";
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            while((line=br.readLine())!=null){
                String[] words = line.split(" ");
                for(String word : words) {
                    if(word.length() > largestWord.length()){
                        largestWord = word;
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Largest word is: "+largestWord);
    }
}
