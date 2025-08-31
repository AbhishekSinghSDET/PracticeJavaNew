package com.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccurencyOfEachWordInString {


    public static int getFrequencyOfCharacters(String str, char c){
        Map<Character, Integer> m = new LinkedHashMap<>();
//        for(c : str.toCharArray()){
//            m.put(c,m.getOrDefault(c,0)+1);
//        }

        int count = 0;
        for(char a:str.toCharArray()){
            if(a==c){
                count++;
            }
        }
        return count;
    }


    public static Map<Character,Integer> getFrequencyOfCharacters(String str){
        Map<Character, Integer> m = new LinkedHashMap<>();
        for(char p : str.toCharArray()){  //A b h i s h e k
                    m.put(p, m.getOrDefault(p,0)+1);
                }

        return m;
    }

    public static Map<Character,Integer> getFrequencyOfCharacters(String str, char[] c){
        Map<Character, Integer> m = new LinkedHashMap<>();
        for(char p : str.toCharArray()){  //A b h i s h e k  // h //h
           for(char a : c){
               if(a==p){
                   m.put(a,m.getOrDefault(a,0)+1);
                   break;
               }
           }
        }

        return m;
    }

    public static Map<Character,Integer> getFrequencyOfCharactersOptimized(String str, char[] c){
        Map<Character, Integer> m = new LinkedHashMap<>();
        for(char a : c){
            m.put(a, 0);
        }
        for(char p : str.toCharArray()){  //A b h i s h e k  // h //h
            if(m.containsKey(p)){
                m.put(p, m.get(p) +1);
            }
        }

        return m;
    }



    public static void main(String[] args) {
        char[] a = {'b','A','i','h','e','k'};
        char[] b = {'A','b','h','i','s','h'};
        char[] c = {'z','z','z','z','z','h'};
        System.out.println(getFrequencyOfCharacters("Abhishek",'A'));
        System.out.println(getFrequencyOfCharacters("Abhishek"));
        System.out.println(getFrequencyOfCharacters("Abhishek",a));
        System.out.println(getFrequencyOfCharacters("Abhishek",b));
        System.out.println(getFrequencyOfCharacters("Abhishek",c));
        System.out.println(getFrequencyOfCharactersOptimized("Abhishek",c));

     }
}

