package com.String;

import java.util.ArrayList;
import java.util.*;

public class PrintCharDigitSpecialCharFromString {

    public static void main(String[] args) {
        String s = "dsfgregf3213qdfsgdf^&*^sdjka23&*()";
        StringBuilder letter = new StringBuilder();
        StringBuilder digit = new StringBuilder();
        StringBuilder sp = new StringBuilder();

        for(char ch: s.toCharArray()){
            if(Character.isLetter(ch)){
                letter.append(ch);
            }
            else if (Character.isDigit(ch)){
                digit.append(ch);
            }
            else {
                sp.append(ch);
            }
        }

        System.out.println("Letters: "+letter);
        System.out.println("Digit: "+digit);
        System.out.println("Special: "+sp);
    }
}
