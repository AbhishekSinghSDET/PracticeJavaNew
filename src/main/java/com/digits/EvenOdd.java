package com.digits;

import java.util.ArrayList;
import java.util.List;

public class EvenOdd {

    public static String findEvenOdd(int num){
        return (num % 2 == 0) ? "even" : "odd";
    }

    public static List<String> findEvenOdd(int[] num){
        List<String> l = new ArrayList<>();
        for(int n : num){
            l.add(n+ " is " + findEvenOdd(n));
        }
        return l;
    }


    public static void main(String[] args) {
        System.out.println(findEvenOdd(20));
        System.out.println(findEvenOdd(new int[]{1,2,3,4,5}));
    }
}
