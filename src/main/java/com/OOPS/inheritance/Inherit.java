package com.OOPS.inheritance;

class A{

    void display(){
        System.out.println("I am from Class A");
    }
}

class B extends A{
    void display(){
        System.out.println("I am from Class B");
    }
}

class C extends B{
    void display(){
        System.out.println("I am from Class C");
    }
}



public class Inherit {
    public static void main(String[] args) {
        A c = new C();
    }
}
