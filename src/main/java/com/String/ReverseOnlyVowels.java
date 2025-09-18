package com.String;

public class ReverseOnlyVowels {

    public static String revOnlyChar(String str){

        char[] arr = str.toCharArray();
        String vowel = "aeiouAEIOU";
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            if(vowel.indexOf(arr[left])==-1){
                left++;
            }

            else if(vowel.indexOf(arr[right])==-1){
                right--;
            }

            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

       // return  Arrays.toString(arr); // This will print output in array format [1,b,a,2]
        return new String(arr);  // This will print in String format
    }


    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(revOnlyChar(s));
    }
}
