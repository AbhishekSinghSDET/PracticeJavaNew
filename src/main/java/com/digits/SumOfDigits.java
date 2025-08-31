package com.digits;

public class SumOfDigits {

    public static int sumOfDigit(int num){

        int result =0;
        if(num==0){
            return 0;
        }

        num = Math.abs(num);

        while(num>0){
            result = result + num%10;
            num=num/10;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigit(123));
    }
}
