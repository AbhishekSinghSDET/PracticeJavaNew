package com.String;

public class CalculateSumOfNumbersInString {

    public static int calculateSum(String s){
        StringBuilder sb = new StringBuilder();
        int result = 0;

        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                sb.append(c);
            }
            else{
                if(sb.length()>0) {  // reason for this is if back to back characters hi hai to direct
                    // else loop me aaega code, but sb length to 0 hi rahega and we will not get any number which will be added
                    result = result + Integer.parseInt(sb.toString());
                    sb.setLength(0);   // to make StringBuilder empty
                }
            }
        }


        /*reason for writing this outside for loop is , if we have digit at the end of the string,
        it will not go inside else*/
        if(sb.length()>0) {
            result = result + Integer.parseInt(sb.toString());
        }

        return result;
    }

    public static int calculateSum1(String s){

        //Here each single digit it added eg: 1+2+4+5+6+7+8
        int result=0;

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                result = result+Integer.parseInt(String.valueOf(c));
            }
        }


        return result;
    }




    public static void main(String[] args) {
        String str = "12abc45def67hi8";
        System.out.println(calculateSum(str));
        System.out.println(calculateSum1(str));
    }
}
