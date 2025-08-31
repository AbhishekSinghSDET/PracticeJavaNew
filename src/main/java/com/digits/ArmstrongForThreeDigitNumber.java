package com.digits;

public class ArmstrongForThreeDigitNumber {

    /*
    An example of an Armstrong number is 153,
    because it is equal to the sum of its digits raised to the power of the total number of digits
     eg: (3^1 + 3^5 + 3^3 = 1 + 125 + 27 = 153).
     */

    public static boolean findArmstrong(int num){
        int temp = num;
        int armstrong = 0;
        while(temp!=0)
        {
            int lastDigit = temp%10;
            armstrong = armstrong + lastDigit*lastDigit*lastDigit;
            temp = temp/10;
        }

        return num == armstrong;

    }


    public static void main(String[] args) {
        int num = 153;
        System.out.println(findArmstrong(num));

    }
}
