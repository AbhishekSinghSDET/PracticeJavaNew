package com.arrays;

import java.util.Arrays;

public class RotateAnArrayWithinSameArray {

    public static int[] reverse(int[] a){
        int j=0;

        for(int i = 0; i< a.length/2; i++){
            int b = a[i]; // 4
            int c = a[a.length-1-i];  // 1
            a[a.length-1-i] = b; //3 -> 4,
            a[i] = c; //[]]
        }


        return a;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverse(arr)));
    }
}
