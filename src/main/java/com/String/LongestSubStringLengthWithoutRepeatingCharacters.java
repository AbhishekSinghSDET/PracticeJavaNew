package com.String;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringLengthWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>(); // store unique characters
        int left = 0; // left pointer
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) { // right pointer expands
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left)); // shrink window from left
                left++;
            }
            set.add(s.charAt(right)); // add new char
            maxLen = Math.max(maxLen, right - left + 1); // update max
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // 3 ("abc")
        System.out.println(lengthOfLongestSubstring("bbbbb"));    // 1 ("b")
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // 3 ("wke")
    }
}
