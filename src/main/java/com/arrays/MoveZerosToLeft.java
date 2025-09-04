package com.arrays;
import java.util.*;

public class MoveZerosToLeft {

    public static int[] moveZerosToLeft(int[] arr){
        int n = arr.length;
        int zero = 0;
        int nonZero = 0;
        int[] result = new int[n];
        int[] temp = new int[n];



        for(int a : arr){
            if(a==0){
                result[zero++] = a;
            }
            else {
                temp[nonZero++] = a;
            }
        }

        for(int i = 0; i<nonZero;i++){
            result[zero++] = temp[i];
        }

        return result;
    }


    public static void main(String[] args) {

        int[] arr = {0,1,2,3,4,0,0,0,0,5,6};
        System.out.println(Arrays.toString(moveZerosToLeft(arr)));
    }
}
