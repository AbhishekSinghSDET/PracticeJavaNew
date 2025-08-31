package com.arrays;
import java.util.*;

public class MoveZerosToLeft {

    public static int[] moveZerosToLeft(int[] a){
        int n = a.length;
        int nonZeroIndex = n-1;

        for(int i = n-1; i>=0;i--){
            if(a[i]!=0){
                a[nonZeroIndex] = a[i];
                nonZeroIndex--;
            }
        }

        while (nonZeroIndex>=0){
            a[nonZeroIndex]=0;
            nonZeroIndex--;
        }


        return  a;
    }


    public static void main(String[] args) {

        int[] arr = {0,1,2,3,4,0,0,0,0,5,6};
        System.out.println(Arrays.toString(moveZerosToLeft(arr)));
    }
}
