package com.String;

public class TitleCase {

    public static void main(String[] args) {

            String str = "hello world from java";
            String[] arr = str.split(" ");
            StringBuilder sb = new StringBuilder();

            for(String words : arr){
                sb.append(Character.toUpperCase(words.charAt(0)))
                        .append(words.substring(1))
                        .append(" ");
            }

            System.out.println(sb);
    }
}
