package com.String;

import com.digits.SumOfDigits;

public class LastWordInString {

    public static int lengthOfLastWordInString(String s){
        String[] str = s.split(" ");
        String t = str[str.length-1];
        System.out.println(t);
        return t.length();

    }


    public static int lengthOfLastWordInString1(String s){
        char[] c = s.trim().toCharArray();
        System.out.println(c);
        int count = 0;

        for(int i = c.length-1; i>=0;i--){
            if(c[i]!=' '){
                count++;
            }
            else {
                break;
            }
        }

        return count;

    }


    public static void main(String[] args) {
        System.out.println(lengthOfLastWordInString("Hello World Is"));
        System.out.println(lengthOfLastWordInString1("  Abhishek Singh  Is"));
    }
}
