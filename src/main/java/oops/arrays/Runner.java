package oops.arrays;


import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        Person p[] = new Person[3];
        p[0]= new Person("Abhishek",1);
        p[1] = new Person("Rohan",2);
        System.out.println(Arrays.toString(p));

        for(Person p1 : p){
            System.out.println(p1);
        }


        int[] a = new int[2];
        a[0] = 1;
        a[1] = 2;

        System.out.println(Arrays.toString(a));

    }
}
