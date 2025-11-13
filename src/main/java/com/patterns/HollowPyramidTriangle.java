package com.patterns;

public class HollowPyramidTriangle {

    public static void main(String[] args) {
        int n = 5; // number of rows

        for (int i = 1; i <= n; i++) {

            // print spaces before stars
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // print stars and inner spaces
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1) || i == n) {
                    System.out.print("*"); // border stars or last row
                } else {
                    System.out.print(" "); // hollow part
                }
            }

            System.out.println();
        }
    }

  /*  1️⃣ Loop boundaries: k = 1 to 2 * i - 1

    Each row i needs an odd number of positions for proper pyramid shape:

    Row 1 → 1 position (2*1-1 = 1)

    Row 2 → 3 positions (2*2-1 = 3)

    Row 3 → 5 positions (2*3-1 = 5)

… and so on.

    So k iterates over all “slots” in the current row where either a * or space will be printed.*/

/*    2️⃣ Condition: if (k == 1 || k == 2*i-1 || i == n)

    k == 1 → the first position in the row → always print a * (left border).

    k == 2*i-1 → the last position in the row → always print a * (right border).

    i == n → the last row of the pyramid → print * for all positions to create the solid base.*/

/*    3️⃣ Else: hollow part
else {
        System.out.print(" ");
    }


    If a position is not the first, last, or bottom row, print a space.

    This creates the “hollow” inside the pyramid.*/
}
