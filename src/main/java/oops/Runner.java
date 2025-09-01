package oops;

public class Runner {

    public static void main(String[] args) {
        StudentManagementSystemOOPS s1 = new StudentManagementSystemOOPS();

        StudentManagementSystemOOPS s2 = new StudentManagementSystemOOPS();

        //Above, each s1 and s2 will have all properties of Students declared in  StudentManagementSystemOOPS class
        //And s1 and s2 will have memory address of two different objects created in heap memory
        //So we don't have to create array for each student
    }
}
