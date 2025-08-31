package com.Classesss;

public class Staticc {

    public static class Test{

        public void display(){
            System.out.println("This is static class display method");
        }
    }


    public static void main(String[] args) {
        Staticc.Test s = new Staticc.Test();
        s.display();
    }
}
