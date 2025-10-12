package com.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class WaysToIterateMap {

    public static void main(String[] args) {
        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("Abhishek",1);
        map.put("Rohan",2);
        map.put("Kartik",3);
        map.put("Gaurav",4);
        map.put("Ayush",5);

        System.out.println(map);

        //Using entrySet()
        System.out.println("-------Using Entry Set----------------");
        for(Map.Entry<String,Integer> m:map.entrySet()){
            System.out.println(m.getKey()+"---->"+m.getValue());
        }

        //Using keySet()
        System.out.println("-------keySet()----------------");
        for(String s:map.keySet()){
            System.out.println(s);
        }

        //Using values()
        System.out.println("-------values()----------------");
        for(int i:map.values()){
            System.out.println(i);
        }

        //Using lamdas
        System.out.println("-------lamdas----------------");
       map.forEach((k,v)-> System.out.println("Key: "+k+", Value: "+v));


    }
}
