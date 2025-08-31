package com.digits;

public class ReverseNumber {

    public static int reversNo(int num){
        num = Math.abs(num);
        int result = 0;
        while(num>0){
            result = result*10 + num%10;
            num=num/10;
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(reversNo(120));
    }
}
