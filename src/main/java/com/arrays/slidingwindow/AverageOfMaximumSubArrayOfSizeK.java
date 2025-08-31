package com.arrays.slidingwindow;

public class AverageOfMaximumSubArrayOfSizeK {

//Brute Force
    public static int findMaxSumAveragForContinuousArray(int[] arr, int k) {

        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i<=arr.length-k;i++){
            int temp = 0;

            for(int j =0; j<k;j++){
                temp += arr[i+j];  // 0+0, 0+1, 1+0, 1+1, 2+0, 2+1
            }

            if(temp > maxSum){
                maxSum = temp;
            }
        }

        return maxSum/k;
    }


    //Sliding Window
    public static int findMaxSumAverageForContinuousArraySlidingWindow(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;
        int windowSum = 0;

        for(int i = 0; i<k;i++){
            windowSum += arr[i];
        }
        maxSum = windowSum;

        for(int i = k; i<arr.length;i++){
            windowSum += arr[i] - arr[i-k];  // 3 - (3-3), 3 - (4-3), 3 - (5-3)
            maxSum = Math.max(windowSum,maxSum);
        }

        return maxSum/k;
    }


    public static void main(String[] args) {
        int[] arr = {29,1,4,7,9,4,3,11,12,13};
        int k =2;
        System.out.println("Average using Brute Force: "+findMaxSumAveragForContinuousArray(arr,k));
        System.out.println("Average using Sliding Window: "+findMaxSumAverageForContinuousArraySlidingWindow(arr,k));
    }

}
