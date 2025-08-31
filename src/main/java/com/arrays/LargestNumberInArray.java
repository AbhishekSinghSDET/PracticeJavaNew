package com.arrays;

public class LargestNumberInArray {

    public static int findLargestNum(int[] num){

        if(num==null ||  num.length==0){
            throw new IllegalArgumentException("Array is null or empty");
        }

        int min = Integer.MIN_VALUE;
        for(int n : num){
            if(n>min){
                min = n;
            }
        }
        return min;
    }


    public static void main(String[] args) {
        int[] a = {2,3,4,1,12,5,6,7};
        int[] b = {};
        System.out.println(findLargestNum(a));
        System.out.println(findLargestNum(b));
    }
}
