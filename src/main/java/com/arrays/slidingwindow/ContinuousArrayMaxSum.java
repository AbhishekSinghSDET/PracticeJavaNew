package com.arrays.slidingwindow;

/*
input: 1,4,7,9,4,3;
output: 16
*/

public class ContinuousArrayMaxSum {

    // Brute Force Method
    public static int findMaxSumForContinuousArray(int[] a, int k){
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i<=a.length-k;i++){
            int temp = 0;
            for(int j =0; j<k;j++){
                temp = temp + a[i+j];
            }

            if(temp > maxSum){
                maxSum = temp;
            }
        }

        return maxSum;
    }

    //Sliding Window approach
    public static int findMaxSumForContinuousArraySlidingWindow(int[] a, int k){
        int maxSum = Integer.MIN_VALUE;
        int windowSum = 0;

        for(int i = 0 ; i<k; i++){
            windowSum = windowSum + a[i];
        }
        maxSum = windowSum;

        for(int i = k; i<a.length;i++){
            windowSum = windowSum + a[i] - a[i-k];   // 3-3, 4-3, 5-3
            maxSum = Math.max(windowSum, maxSum);
        }

        return maxSum;
    }




    public static void main(String[] args) {
        int[] arr = {1,4,7,9,4,3,11,12};
        int k =2;
        System.out.println(findMaxSumForContinuousArray(arr,k));
        System.out.println(findMaxSumForContinuousArraySlidingWindow(arr,k));
    }
}
