package com.patterns;

public class DiamondPatternComplete {

    public static void main(String[] args) {

        int row = 5;

        int n = 5; // number of rows for the upper half

        // 🔹 Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // 🔹 Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
