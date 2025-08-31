package com.arrays;

import java.util.Arrays;

public class SortArrayAscending {

    public static int[] sortArrayAsc(int[] a){

        int b = 0;

        for(int i =0; i<a.length;i++){
            for(int j = i+1; j<a.length;j++){
                if(a[i]>a[j]){
                    b=a[i];
                    a[i]=a[j];
                    a[j]=b;
                }
            }
        }

        return a;
    }


    public static void main(String[] args) {
        int[] a = {2,4,6,1,0,8,9};
        System.out.println(Arrays.toString(sortArrayAsc(a)));
    }
}
