package com.OOPS.abstraction;


abstract class AreaDemo{

    abstract int area();
}


class Square extends AreaDemo{


    @Override
    int area() {
        int a=10;
        return a*a;
    }
}

class Rectangle extends AreaDemo{


    @Override
    int area() {
        int a=10;
        int b=20;
        return a*b;
    }
}

public class CalculateArea {

    public static void main(String[] args) {
        AreaDemo a = new Square();
        System.out.println(a.area());

        a = new Rectangle();
        System.out.println(a.area());

    }
}
