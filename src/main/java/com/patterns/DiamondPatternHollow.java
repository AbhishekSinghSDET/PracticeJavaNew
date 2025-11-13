package com.patterns;

public class DiamondPatternHollow {

    public static void main(String[] args) {
        int n = 5; // number of rows for upper half

        // 🔹 Upper half of the diamond
        for (int i = 1; i <= n; i++) {

            // print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // print stars and inner spaces
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1)) {
                    System.out.print("*"); // border stars
                } else {
                    System.out.print(" "); // hollow part
                }
            }

            System.out.println();
        }

        // 🔹 Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {

            // print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // print stars and inner spaces
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

   /* 1️⃣ Loop boundaries: k = 1 to 2*i - 1

    Each row of the diamond has an odd number of positions to keep it symmetric.

    For the upper half:

    Row 1 → 1 position (2*1-1 = 1)

    Row 2 → 3 positions (2*2-1 = 3)

    Row 3 → 5 positions (2*3-1 = 5)

…and so on.

    For the lower half, you similarly use i decreasing, so positions still follow 2*i-1.

    This loop iterates over all positions in the row and decides whether to print a * or a space.

2️⃣ Condition: if (k == 1 || k == (2*i - 1))

    k == 1 → the first position in the current row → always print * (left border).

    k == 2*i-1 → the last position in the current row → always print * (right border).

    Everything else is inside the diamond → will be spaces to make it hollow.

3️⃣ Else: hollow part
else {
        System.out.print(" ");
    }


    If a position is not the first or last in that row, print a space.

    This creates the “hollow” inside the diamond while keeping the outer stars visible.*/
}
