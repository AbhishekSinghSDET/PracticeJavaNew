package com.String;

import java.util.HashMap;
import java.util.Map;

public class FindLastNonRepeatingCharacter {

    public static char findLastNonRepeatingCharacter(String str){

        Map<Character, Integer> map = new HashMap<>();

        for(char c: str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        char result = '\0';

        for(int i = str.length()-1; i>=0;i--){
            if(map.get(str.charAt(i))==1){
                result = str.charAt(i);
                break;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        String s = "aakbbcnn";  // ouput: c
        System.out.println(findLastNonRepeatingCharacter(s));
    }
}
