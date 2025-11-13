package com.String;

public class StringToInteger {

    public static void main(String[] args) {
        String str = "1234";
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Convert character to digit (using ASCII value)
            int digit = ch - '0';  // '3' - '0' = 3

            result = result * 10 + digit;
        }

        System.out.println("Converted integer: " + result);

    }
}
