package com.String;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {

    public static String removeDuplicatesFromString(String str){

        Set<Character> st = new LinkedHashSet<>();
        String result = ""; // creating this we want result in String format

        for (char c : str.toCharArray()){
            if(st.add(c)){
                result=result+c;
            }
        }

      //  return st.toString(); //THis will print in this format [J, a, v] but we want String
        return result;

    }

    public static void main(String[] args) {
        String s = "Java";   //op > Jav
        System.out.println(removeDuplicatesFromString(s));
    }
}
