package com.Miscellaneous;

final public class Temp {

    public void Test(){
        System.out.println("Instance");
    }


    public static void Test1(Temp t){
        System.out.println("I am static");
        t.Test();
    }




    public static void main(String[] args) {
        Temp t = new Temp();

    }
}
