package com.patterns;

public class ReverseTrianglePattern1 {

    public static void main(String[] args) {
        int row = 5;

        for (int i = row - 1; i >= 1; i--) {

            for (int j = row - 1; j >= i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
