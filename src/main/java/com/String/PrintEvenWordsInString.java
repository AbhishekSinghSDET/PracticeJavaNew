package com.String;

import oops.inheritance.A;

import java.util.LinkedList;
import java.util.List;

public class PrintEvenWordsInString {

    //Take each word from string and check if length is even then print it

    public static List<String> printEvenWords(String s1){
        List<String> l = new LinkedList<>();
        String[] str = s1.split(" ");

        for(int i = 0; i<str.length; i++){
            int temp = str[i].length();
            if(temp%2==0) {
                l.add(str[i]);
            }
        }

        return l;
    }

    public static void main(String[] args) {
        String s = "My name is Abhishek and I am from Mumbai";
        System.out.println(printEvenWords(s));
    }
}
