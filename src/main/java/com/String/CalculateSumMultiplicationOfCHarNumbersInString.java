package com.String;

public class CalculateSumMultiplicationOfCHarNumbersInString {

    public static void main(String[] args) {

        //Here first we are doing multiplication of digits and multiplication of ascii value of characters
        // and then addition of both

            String s = "a2b3c4";
            int result=0;
            int temp = 1;
            int temp1 = 1;

//            for(int i = 0; i<s.length();i++){
//                System.out.println((int)s.charAt(i));
//            }


            for(char c : s.toCharArray()){
                if(Character.isDigit(c)){
                    int b = Integer.parseInt(String.valueOf(c)); // important step
                    temp = temp*b;
                }
                else {
                    int a = (int) c;
                    temp1 = temp1 * a;
                }
            }

            result = temp+temp1;
            System.out.println(result);
    }
}
