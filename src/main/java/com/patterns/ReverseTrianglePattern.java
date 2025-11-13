package com.patterns;

public class ReverseTrianglePattern {

    // Exactly same as DesignPattern5 bas star ke aage space add karna hai
    //In this star count decreases in a sequence one below the other 5 star then next line 4 star and so on

    public static void main(String[] args) {
        int row = 5; // number of rows

        for (int i = row; i >= 1; i--) {
            // print spaces
            for (int j = row; j > i; j--) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" "); // bas yaha space add ki hai bas baaki same to same of DesignPatter5
            }

            // move to next line
            System.out.println();
        }
    }
}
