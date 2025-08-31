package com.arrays;

public class secondLargestNumberInArray {

    public static int findSecondLargestNum(int[] arr) {
        int min = Integer.MIN_VALUE;
        int secondMin = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > min) {
                secondMin = min;
                min = num;
            } else if (num < min && num > secondMin) {
                secondMin = num;
            }
        }
        return secondMin;
    }


    public static void main(String[] args) {
        int[] a = {2,3,6,7,1,9,4,8};
        System.out.println(findSecondLargestNum(a));
    }
}
