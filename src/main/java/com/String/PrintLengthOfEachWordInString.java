package com.String;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintLengthOfEachWordInString {

    public static void main(String[] args) {
        String s = "My name is Abhishek and I am from Mumbai";
        String arr[] = s.split(" ");

        Map<String,Integer> m = new LinkedHashMap<>();

        for(String word: arr){
            System.out.println(word+" : "+word.length());
            m.put(word,word.length());
        }

        System.out.println(m);
    }
}
