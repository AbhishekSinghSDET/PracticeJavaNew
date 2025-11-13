package com.patterns;

public class DiamodPattern4 {


    public static void main(String[] args) {
        int row = 5;

        for(int i = 1; i<=row;i++){

            // print spaces
            for (int j = i; j < row; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
