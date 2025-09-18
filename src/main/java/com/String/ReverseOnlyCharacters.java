package com.String;

import java.util.Arrays;

public class ReverseOnlyCharacters {

    public static String revOnlyChar(String str){

        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            if(!Character.isLetter(arr[left])){
                left++;
            }

            else if(!Character.isLetter(arr[right])){
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
        String s = "1ab2";
        System.out.println(revOnlyChar(s));
    }
}
