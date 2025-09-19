package com.arrays;

import java.util.Arrays;

public class ReverseAnArray {

    public static int[] reverseArray(int[] arr){
        int[] result = new int[arr.length];
        int n = 0;


        for(int i = arr.length-1; i>=0;i--){
            result[n] = arr[i];
            n++;
        }

        return result;
    }


    //Another Ssolution without creating an extra array
    //Here we will use two pointer approach and swap the numbers

    public static int[] reverseArray1(int[] arr){

        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return arr;
    }



    public static void main(String[] args) {
        int[]  a = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(reverseArray(a)));

        System.out.println("Without using any extra array:  "+Arrays.toString(reverseArray1(a)));
    }
}
