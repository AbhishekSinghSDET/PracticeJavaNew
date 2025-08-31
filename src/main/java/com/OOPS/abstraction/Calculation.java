package com.OOPS.abstraction;

public class Calculation extends Abstraction{

    @Override
    public int sum(int a, int b) {

        return a+b;

    }

    @Override
    public double sum(double a, double b) {
        return a+b;
    }

    public static void main(String[] args) {
        Calculation c = new Calculation();
        System.out.println(c.sum(10,20));
        System.out.println(c.sum(11.5,12.5));
    }
}
