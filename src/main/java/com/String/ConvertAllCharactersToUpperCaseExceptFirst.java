package com.String;

public class ConvertAllCharactersToUpperCaseExceptFirst {

    public static String convertUpperCase(String s){
        String result = "";
        result = s.charAt(0)+s.substring(1).toUpperCase();
        return result;
    }


    public static void main(String[] args) {
        String str = "abhishek";
        System.out.println(convertUpperCase(str));
    }
}
