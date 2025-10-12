package com.String;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

        public static String longestSubstring(String s) {
            Set<Character> set = new HashSet<>();
            int left = 0, maxLength = 0, startIndex = 0;

            for (int right = 0; right < s.length(); right++) {
                // If duplicate found, shrink window from left
                while (set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(right));

                // Update max substring details
                if (right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                    startIndex = left;
                }
            }
            // Return the actual substring
            return s.substring(startIndex, startIndex + maxLength);
        }

        public static void main(String[] args) {
            String input = "abcabcbb";
            String result = longestSubstring(input);
            System.out.println("Longest Substring: " + result);
        }
}


