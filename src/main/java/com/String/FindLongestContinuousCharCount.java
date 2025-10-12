package com.String;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindLongestContinuousCharCount {

    public static char findMaxContinuousChar(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty");
        }

        char[] chars = s.toCharArray();

        char maxChar = chars[0];
        int maxCount = 1;

        char currentChar = chars[0];
        int currentCount = 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == currentChar) {
                currentCount++;
            } else {
                currentChar = chars[i];
                currentCount = 1;
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxChar = currentChar;
            }
        }

        System.out.println("Character: " + maxChar + " Count: " + maxCount);
        return maxChar;
    }

    public static void main(String[] args) {
        String s = "jjaaajjbjjzddddddd";
        findMaxContinuousChar(s);  // Output: Character: a Count: 3
    }
}
