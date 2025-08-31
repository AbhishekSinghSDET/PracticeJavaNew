package com.digits;

public class ArmstrongForAnyDigitNumber {

    public static void main(String[] args) {
        int num = 9474;   // try 153, 370, 9474, 123
        int original = num;
        int sum = 0;

        // Step 1: count digits
        int digits = 0, temp = num;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        // Step 2: calculate sum of digits^digits
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) {   // manual power calc instead of Math.pow
                power = power * digit;
            }
            sum = sum + power;
            temp = temp / 10;
        }

        // Step 3: check
        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is NOT an Armstrong number");
        }
    }
}
