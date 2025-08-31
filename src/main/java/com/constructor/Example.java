package com.constructor;

public class Example {

    private String name;

    Example(){
    }

    Example(String name){
        this.name=name;
    }

    public static void main(String[] args) {
        Example e = new Example();
        System.out.println(e.name);
        Example e1 = new Example("Abhishek");
        System.out.println(e1.name);

    }

}
