package com.String;

public class MergeTwoStrings {

    public static String mergeStrings(String s1, String s2) {
        StringBuilder result = new StringBuilder();

        int i = 0, j = 0;

        // Merge one char from s1, one from s2
        while (i < s1.length() && j < s2.length()) {
            result.append(s1.charAt(i++));
            result.append(s2.charAt(j++));
        }

        // Append remaining characters
        if (i < s1.length()) {
            result.append(s1.substring(i));
        }
        if (j < s2.length()) {
            result.append(s2.substring(j));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "xyzabc";
        System.out.println(mergeStrings(s1, s2)); // axbyczabc
    }
}
