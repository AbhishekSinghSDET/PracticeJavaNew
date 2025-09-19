package com.patterns;

public class Pattern1 {

    public static void main(String[] args) {

        for(int i = 1 ; i<=5;i++){
            for(int j = 1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("-------------Star Printing------------------------");
        System.out.println("-----------------------------------------");

        for(int i = 1 ; i<=5;i++){
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---------------Alphabet Printing---------------------");
        System.out.println("-----------------------------------------");

        for(int i = 1 ; i<=5;i++){
            for(int j = 1; j<=i;j++){
                System.out.print((char)('a'+ j-1));   //ASCII value concept
            }
            System.out.println();
        }
    }
}
