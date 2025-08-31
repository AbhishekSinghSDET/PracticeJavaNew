package com.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintCharFrequency {

    public static List<Character> countFrequency(String s){

        char[] c = s.toCharArray();
        List<Character> result = new ArrayList<>();

        Map<Character, Integer> map = new HashMap<>();

        for(char a : c){
            map.put(a,map.getOrDefault(a,0)+1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            if (count > 2 && count < 5) {
                result.add(entry.getKey());
            }
        }
        return result;

    }

    public static void main(String[] args) {

        System.out.println(countFrequency("AbhiAbhiaAbhi`"));

    }
}
