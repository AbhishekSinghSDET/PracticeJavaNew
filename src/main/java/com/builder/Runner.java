package com.builder;

import java.util.Locale;

public class Runner {

    public static void main(String[] args) {
//        Employee e1 = new Employee("Abhishek",101,1500);
//        System.out.println(e1);

        Employee e2 = new Employee.Builder().name("Rohan").salary(2000).empID(102).build();
        System.out.println(e2);
    }


}
