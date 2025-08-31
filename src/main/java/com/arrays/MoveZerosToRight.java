package com.arrays;

import java.util.Arrays;

public class MoveZerosToRight {

    public static int[] moveZerosToRight(int[] a){
        int n = a.length;
        int nonZeroIndex = 0;

        for(int i = 0;i<n;i++){
            if(a[i]!=0){
                a[nonZeroIndex] = a[i];
                nonZeroIndex++;
            }
        }

        while (nonZeroIndex < n){
            a[nonZeroIndex]=0;
            nonZeroIndex++;
        }

        return a;
    }


    public static void main(String[] args) {

        int[] arr = {2,4,3,0,0,7,0,1};
        System.out.println(Arrays.toString(moveZerosToRight(arr)));
    }
}
