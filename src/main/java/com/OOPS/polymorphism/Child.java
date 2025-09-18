package com.OOPS.polymorphism;

public class Child extends Parent{

    public static void m1(){
        System.out.println("Child m1 method");
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.m1();
    }
}

