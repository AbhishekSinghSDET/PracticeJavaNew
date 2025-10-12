package com.constructor;

public class B extends A{


    public B(int a, int b) {
        super(a, b);
        System.out.println(b-a);
    }

    public static void main(String[] args) {
        A a = new B(10,20);
        System.out.println(a);
    }
}
