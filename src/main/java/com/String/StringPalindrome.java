package com.String;

public class StringPalindrome {

    public static boolean isStringPalindrome(String s){
        StringBuilder sb = new StringBuilder(s).reverse();

        if(s.equals(sb.toString())){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "madam";
        System.out.println(isStringPalindrome(s1));
    }
}
