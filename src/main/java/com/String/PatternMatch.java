package com.String;

import java.sql.SQLOutput;

public class PatternMatch {

    /*🔁 Example Walkthrough:
Input: s = "leetcode", p = "ee*e"
→ prefix = "ee", suffix = "e"
→ Valid substring = "eetcode" in "leetcode" ✔️

Input: s = "car", p = "c*v"
→ prefix = "c", suffix = "v"
→ No substring starts with "c" and ends with "v" ✖️*/

    public static boolean isPatternSubstring(String s, String p) {
        int starIndex = p.indexOf('*');
        String prefix = p.substring(0, starIndex);
        String suffix = p.substring(starIndex + 1);

        int n = s.length();

        // Try every possible substring of s
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String sub = s.substring(i, j + 1);
                if (sub.startsWith(prefix) && sub.endsWith(suffix)) {
                    return true;
                }
            }
        }

        return false;
    }

    // Example usage
    public static void main(String[] args) {
        System.out.println(isPatternSubstring("leetcode", "ee*e")); // true
        System.out.println(isPatternSubstring("car", "c*v"));       // false
        System.out.println(isPatternSubstring("luck", "u*"));       // true
        System.out.println(isPatternSubstring("Abhishek","b*s"));   //true
        System.out.println(isPatternSubstring("Abhishek","b*z"));   //false
        System.out.println(isPatternSubstring("Abhishek","b*h"));   //true
    }
}

