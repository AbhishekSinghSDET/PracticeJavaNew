package com.arrays;

import java.util.*;

public class IntersectionOfTwoArrays {

    public static Set<Integer> findIntersection(int[] arr1, int[] arr2){

        Set<Integer> s1 = new HashSet<>();
        for(int a1:arr1){
            s1.add(a1);
        }

        Set<Integer> s2 = new HashSet<>();
        for(int a2:arr2){
            if(s1.contains(a2)){
                s2.add(a2);
            }
        }

        return s2;
    }


    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {3,4,5,6,7,8};

        System.out.println(findIntersection(a,b));
    }
}
