package oops.encapsulation;

public class Runner {

    public static void main(String[] args) {
        StudentManagementSystemOOPS s1 = new StudentManagementSystemOOPS();

        StudentManagementSystemOOPS s2 = new StudentManagementSystemOOPS();

        //Above, each s1 and s2 will have all properties of Students declared in  StudentManagementSystemOOPS class
        //And s1 and s2 will have memory address of two different objects created in heap memory
        //So we don't have to create array for each student

/*
        s1.name="Abhishek";
        s1.age=17;
        s1.rollNumber=1;
        s1.marksObtainedInEnglish=78;
        s1.getMarksObtainedInMaths=78;

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.marksObtainedInEnglish);
        System.out.println(s1.getMarksObtainedInMaths);

*/

        Teacher t1 = new Teacher("Abhishek",30,"9867392211","Mumbai","T101","Java",10);
        Teacher t2 = new Teacher("Rohan",30,"9867392211","Mumbai","T101","Java",10);
        t1.displayTeacherInfo();
        System.out.println("Total teachers enrolled: "+Teacher.getTotalTeacherCount()); //jitne object honge utna count
    }
}
