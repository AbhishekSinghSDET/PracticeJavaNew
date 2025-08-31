import java.util.ArrayList;
import java.util.List;

public class Temp {

    public static List<String> reverse(String str){
        List<String> l = new ArrayList<>();

        for(int i = 0;i<str.length();i++){
            for(int j =i+1;j<=str.length();j++){
                l.add(str.substring(i,j));
            }

        }


        return l;
    }

    public static void main(String[] args) {
        String s = "abc";

        System.out.println(reverse(s));
    }
}



