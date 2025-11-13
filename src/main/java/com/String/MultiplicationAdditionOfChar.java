package com.String;

public class MultiplicationAdditionOfChar {

    public static int getSum(String str){
        int digitProduct=1;
        int charProduct=1;
        int result=0;

        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                digitProduct*=Character.getNumericValue(c);
            }
            else if(Character.isLetter(c)){
                charProduct*=(int)c;
            }
        }

        result = digitProduct+charProduct;
        return result;
    }

    public static void main(String[] args) {
        String s = "a4b3c2d1";
        System.out.println(getSum(s));
    }
}
