package com.digits;

import java.math.BigInteger;

public class FactorialOfLargeNumber {

    public static BigInteger findfactorial(int a){

        BigInteger result= BigInteger.ONE;

        for(int i =a;i>0;i--){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(findfactorial(5));
    }
}
