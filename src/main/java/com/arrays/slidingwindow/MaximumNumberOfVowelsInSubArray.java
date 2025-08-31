package com.arrays.slidingwindow;

/*
input: t,h,i,s,i,s,a,l,o,n,g,x
k: 4
ouput: 2
*/


public class MaximumNumberOfVowelsInSubArray {

    public static int findMaxNoOfVowelsInSubArray(char[] arr, int k){
        int count = 0;

        for(int i =0; i<=arr.length-k;i++){
            int temp=0;
            for(int j =0;j<k;j++){
                char c = arr[i+j];

                if(c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u'){
                temp++;
                }

                if(temp>count){
                    count = temp;
                }

            }
        }

        return count;

    }

    public static int findMaxNoOfVowelsInSubArraySlidingWindow(char[] arr, int k){
        int count = 0;
        int temp = 0;


        for(int i = 0; i<k;i++) {
            char c = arr[i];
            if (isVowel(c)) {
                temp++;
            }
        }

            count = temp;


            for(int i = k ; i<arr.length;i++){
                if(isVowel(arr[i-k])){
                    temp--;
                }

                if(isVowel(arr[i])){
                    temp++;
                }

                count = Math.max(temp,count);
            }


        return count;

    }

    public static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }



    public static void main(String[] args) {
        char[] c = {'t','h','i','s','i','s','a','l','o','e','o','x','a','e','i','o'};
        int k =4;
        System.out.println("Max vowels using Brute Force: "+findMaxNoOfVowelsInSubArray(c,k));
        System.out.println("Max vowels using Sliding Window: "+findMaxNoOfVowelsInSubArraySlidingWindow(c,k));
    }
}
