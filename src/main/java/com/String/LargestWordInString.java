package com.String;

public class LargestWordInString {

    public static void main(String[] args) {
        String s = "I am a Abhishek name boy AbhishekAbhishek";
        String[] arr = s.split(" ");
        int temp = 0;
        String result = null;
        for(String words:arr){
            int length = words.length();
            if(length > temp){
                temp = length;
                result = words;
            }
        }
        System.out.println(result +":"+temp);
    }
}
