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


    public static void main(String[] args) {

        int[] arr = {2,4,3,0,0,7,0,1};
        System.out.println(Arrays.toString(moveZerosToRight(arr)));
    }
}
