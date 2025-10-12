import java.util.*;

public class Rough {

    public static String charFreqEncoding(String str){

        StringBuilder sb = new StringBuilder();
        String result = "";

        result = str.charAt(0)+sb.append(str.substring(1).toUpperCase()).toString();
        return result;

    }


    public static void main(String[] args) {
       String s = "abc";

        System.out.println(charFreqEncoding(s));

    }
}
