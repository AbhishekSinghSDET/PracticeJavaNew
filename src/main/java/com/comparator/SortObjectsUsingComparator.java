package com.comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortObjectsUsingComparator {

    private static List<Student> studentList = new ArrayList<Student>();

    public static void main(String[] args) {

        Student s1 = new Student(1, "Rohan");
        Student s2 = new Student(2, "Abhishek");
        Student s3 = new Student(3, "Kartik");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        System.out.println(studentList);
        sortByName();

    }

    public static void sortByName() {
        Comparator<Student> sortName = (o1, o2) -> o1.getName().compareTo(o2.getName());

        Collections.sort(studentList, sortName);
        System.out.println(studentList);

    }
}
