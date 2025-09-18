package com.digits;

public class ConvertNumberToString {

    public static void main(String[] args) {

        int num = 123;
        String s = num+"";
        String s1 = String.valueOf(num);
        String s2 = Integer.toString(num);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
    }
}
