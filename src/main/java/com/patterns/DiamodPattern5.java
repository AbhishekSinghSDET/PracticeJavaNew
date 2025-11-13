package com.patterns;

public class DiamodPattern5 {


    public static void main(String[] args) {
        int row = 4; // number of rows

        for (int i = row; i >= 1; i--) {

            // print spaces
            for (int j = row; j > i; j--) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // move to next line
            System.out.println();
        }
    }
}
