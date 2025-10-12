package com.String;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindMostOccurenceCharCount {

    public static Map<Character,Integer> maxCharCount(String s){
        //ouput j = 6
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int temp = 0;
        char c = '\0';
        Map<Character,Integer> result = new LinkedHashMap<>();
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() > temp){
                temp = entry.getValue();
                c = entry.getKey();
            }
        }
        result.put(c,temp);
        return result;
    }



    public static void main(String[] args) {
        String s = "jjaaajjbjjz";
        System.out.println(maxCharCount(s));
    }
}
