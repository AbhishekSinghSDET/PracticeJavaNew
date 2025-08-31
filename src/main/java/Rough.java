import java.util.*;

public class Rough {

    public static String charFreqEncoding(String s){
        int count =1;
        StringBuilder sb = new StringBuilder();


        for(int i = 0; i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else{
                sb.append(s.charAt(i)).append(count);
                count=1;
            }
        }
        sb.append(s.charAt(s.length()-1)).append(count);

       return sb.toString();

    }


    public static void main(String[] args) {
        String str = "AAABBCCDD";

        System.out.println(charFreqEncoding(str));

    }
}
