package com.String;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfEachWord {

    public static Map<String,Integer> findWordFrequency(String s){

        Map<String,Integer> map = new LinkedHashMap<>();
        String[] a = s.split(" ");

        for(String c : a){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        return map;
    }


    public static void main(String[] args) {

        System.out.println(findWordFrequency("Abhishek is a good boy Pari is a good girl"));
    }
}
