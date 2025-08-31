package com.arrays;

import java.util.Arrays;

public class SortArrayDescending {

    public static int[] sortAnArray(int[] a){

        int b =0;

        for(int i = 0; i<a.length;i++){
            for(int j = i+1; j<a.length;j++){
                if(a[i]<a[j]){
                    b=a[i];
                    a[i]=a[j];
                    a[j]=b;

                }
            }
        }

        return a;
    }


    public static void main(String[] args) {
        int[] a = {2,6,3,1,7,0};
        System.out.println(Arrays.toString(sortAnArray(a)));
    }
}
