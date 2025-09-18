package com.digits;

public class Palindrome {

    public static boolean isNumPalindrome(int num){

        int temp = num;
        int rem = 0;

        while(temp > 0){
            int digit = temp%10;
            rem = rem*10+digit;
            temp=temp/10;
        }

        if(num==rem){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n= 121;
        System.out.println(isNumPalindrome(n));
    }
}
