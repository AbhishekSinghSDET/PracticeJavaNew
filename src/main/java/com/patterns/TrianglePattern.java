package com.patterns;

public class TrianglePattern {

    // Exactly same as DesignPattern4 bas star ke aage space add karna hai
    //In this star count increases in a sequence one below the other 1 star then next line 2 star and so on

    public static void main(String[] args) {
        int row = 5;

        for(int i = 1; i<=row;i++){

            // print spaces
            for (int j = i; j < row; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");  // bas yaha space add ki hai bas baaki same to same of DesignPatter4
            }

            System.out.println();

        }
    }
}
