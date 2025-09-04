package oops.encapsulation;

public class StudentManagementSystemOOPS {

    //instance variables are not static and declared in class
    //Instance variables are created in heap memory
    //Instance variables are initialized with default value, whereas for local variable we need to initialize explicitly

    String name;
    int age;
    int rollNumber;
    double marksObtainedInEnglish;
    double getMarksObtainedInMaths;

    public void calculatedMarks(){
        System.out.println("Marks Obtained: "+marksObtainedInEnglish+getMarksObtainedInMaths);
    }
}
