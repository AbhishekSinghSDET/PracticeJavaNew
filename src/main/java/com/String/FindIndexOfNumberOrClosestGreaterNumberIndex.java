package com.String;

public class FindIndexOfNumberOrClosestGreaterNumberIndex {

    public static int findIndex(int[] arr, int k){

        //If number is present in the array
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==k){
                return i;
            }
        }

        //Step 2 if number is not found then find closest number index
        int minDiff = Integer.MAX_VALUE;
        int closestIndex = -1;

        for(int i = 0; i<arr.length; i++) {
            if (arr[i] > k) {  // Consider only number greater than key
                int diff = arr[i] - k;  // calculate how much greater
                if (minDiff > diff) {  // found a close one
                    minDiff = diff;
                    closestIndex = i;
                }
            }
        }


        return closestIndex;
    }


    public static void main(String[] args) {
        int[] a = {4,6,2,8,9,10};
        int key = 7;
        int index = findIndex(a,key);

        if(index==-1){
            System.out.println("No element found");
        }
        else {
            System.out.println("Index found at: "+index);
        }
    }
}
