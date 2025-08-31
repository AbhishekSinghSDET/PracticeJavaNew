package com.digits;

public class Factorial {

    public static int findfactorial(int a){

        int result=1;

       for(int i =a;i>0;i--){
           result = result * i;
       }
       return result;
    }


    public static void main(String[] args) {
        System.out.println(findfactorial(3));
    }
}
