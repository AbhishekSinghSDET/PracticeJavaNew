import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Temp {

    public static boolean reverse(String str1){

        Stack<Character> s =  new Stack<>();

        for(char c : str1.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                s.push(c);
            } else {
                if (s.isEmpty()) {
                    return false;
                }

                char top = s.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "{[]}";

        System.out.println(reverse(s1));
    }
}



