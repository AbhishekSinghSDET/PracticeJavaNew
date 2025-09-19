package com.arrays;

import java.util.Arrays;

public class MoveZerosToRight {

    public static int[] moveZerosToRight(int[] arr){
        int n = arr.length;
        int zero = 0;
        int nonZero = 0;
        int[] result = new int[n];
        int[] temp = new int[n];

        for(int a : arr){
            if(a!=0){
                result[nonZero++] = a;
            }
            else {
                temp[zero++] = a;
            }
        }

        for(int i = 0; i<zero;i++){
            result[nonZero++] = temp[i];
        }

        return result;
    }

    //Simplest way of solving this

    public static int[] moveZerosToRight1(int[] arr){
        int nonZero = 0;

        for(int current = 0 ; current<arr.length; current++){
            if(arr[current]!=0){
                int temp = arr[nonZero];
                arr[nonZero] = arr[current];
                arr[current] = temp;
                nonZero++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {2,4,3,0,0,7,0,1};
        System.out.println(Arrays.toString(moveZerosToRight(arr)));
        System.out.println("Simple way: "+Arrays.toString(moveZerosToRight1(arr)));
    }
}
