package com.arrays;

public class MissingNumInArray {

    public static int findMissingNum(int[] a){
        int start = a[0];

        for(int i = 0; i<a.length;i++){
            if(a[i]!=start){
                return start;
            }
            start++;
        }

        return -1;

    }




    public static void main(String[] args) {
        int[] arr = {7,9,10,11,12,13};
        System.out.println(findMissingNum(arr));
    }
}
