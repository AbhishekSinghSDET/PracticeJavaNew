import java.util.*;

public class Rough {

    public static boolean charFreqEncoding(String str){

        Stack<Character> stack =  new Stack<>();

        for(char c : str.toCharArray()){
            if(c=='(' || c=='{' || c =='['){
                stack.push(c);
            }
            else {
                if(stack.isEmpty()){
                    return false;
                }

                char pop = stack.pop();
                if ((c == ')' && pop != '(') ||
                        (c == '}' && pop != '{') ||
                        (c == ']' && pop != '[')) {
                    return false;
                }
            }
        }


        return stack.isEmpty();
    }


    public static void main(String[] args) {
       String s = "()]{}";

        System.out.println(charFreqEncoding(s));

    }
}
