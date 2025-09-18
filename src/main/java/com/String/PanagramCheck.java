package com.String;

import java.util.LinkedHashSet;
import java.util.Set;

public class PanagramCheck {

    public static boolean isPanagramCheck(String str){

      /*  👉 Explanation for interview
        Convert the input string to lowercase.
        Iterate over characters, and insert alphabets into a HashSet.
        If the set size is 26, the string is a pangram.*/


        str = str.toLowerCase();  // this is important step
        char[] c = str.toCharArray();
        Set<Character> set = new LinkedHashSet<>();

        for(char c1:c){
            if(Character.isLetter(c1)) {
                set.add(c1);
            }
        }

        System.out.println(set);
        return set.size()==26;
    }

    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPanagramCheck(s));
    }
}
