package com.String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateCharInString {

    public static List<Character> findDuplicateChar(String s){
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        for(char c : s.toCharArray()){
            if(!seen.add(c)){ // if already seen, add to duplicates
                duplicates.add(c);
            }
        }

        return new ArrayList<>(duplicates);

    }


    public static void main(String[] args) {

        System.out.println(findDuplicateChar("AbhishekAbhishek"));
    }
}
