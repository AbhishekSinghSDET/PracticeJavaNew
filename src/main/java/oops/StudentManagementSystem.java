package oops;

import java.sql.SQLOutput;
import java.util.Scanner;

//This is done using Procedural Programming which is not a good practice
//Now we will create it using OOPS in next java class name: StudentManagementStudentOOPSß

public class StudentManagementSystem {
    //GLOBAL VARIABLES
    public static String[] studentName =  new String[50];
    public static int[] studentAge = new int[50];
    public static int[] rollNo =  new int[50];
    public static Scanner sc = new Scanner(System.in);
    public static int index=0;

    public static void main(String[] args) {
        int option;

        System.out.println("Welcome to Student Management System");

        System.out.println("Please select any of the following options: [1-4]");

        System.out.println("1. Add Student");
        System.out.println("2. Print Student Details");
        System.out.println("3. Print All Student Details");
        System.out.println("4. Exit");

        option = sc.nextInt();

        switch (option){
            case 1: addStudent();
            break;

            case 2: printStudentInfo();
            break;

            case 3: printAllStudentInfo();
            break;

            case 4: exitMethod();
            break;
        }

        addStudent();  //static methods can call another static methods

    }

    public static void addStudent(){

        System.out.println("Enter Student Name");
        studentName[index] = sc.next();

        System.out.println("Enter Student Age");
        studentAge[index] = sc.nextInt();

        System.out.println("Enter Student Roll No");
        rollNo[index] = sc.nextInt();

        System.out.println("Student Name: "+studentName[index]);
        System.out.println("Student Age: "+studentAge[index]);
        System.out.println("Student RollNo: "+rollNo[index]);
    }

    public static void printStudentInfo(){
        System.out.println("Print Student Info");
    }

    public static void printAllStudentInfo(){
        System.out.println("Print All Student Info");
    }

    public static void exitMethod(){
        System.exit(0);
    }
}
