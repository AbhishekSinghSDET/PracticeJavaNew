package com.digits;

public class CountNoOfDigits {

    public static int countDigit(int num){
        int count = 0;
        int result =0;
        if(num==0){
            return 0;
        }

        num = Math.abs(num);

        while(num>0){
            result = num%10;
            count++;
            num=num/10;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigit(-1021));
    }
}
