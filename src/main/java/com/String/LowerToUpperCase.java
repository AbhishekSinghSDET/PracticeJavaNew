package com.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowerToUpperCase {

    public static List convertStringLowerToUpperCase(List<String> list ){
        List<String> output = new ArrayList<>();
        String result="";
        for(String s : list){
            if(s.startsWith("a")){
                result = s.charAt(0)+s.substring(1).toUpperCase();
                output.add(result);
            }

        }
        return output;

    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apricot", "avocado", "cherry");
        System.out.println(convertStringLowerToUpperCase(list));
    }
}
