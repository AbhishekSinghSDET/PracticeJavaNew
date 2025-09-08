package project;

public class Runner {

    public static void main(String[] args) {
        Student s1 = new Student("Abhishek",30,1,90,90,90 );
        System.out.println(s1);
        System.out.println("Get total student count: "+ Student.getStudentCount());

        Student s2 = new Student("Rohan",30,1,90,90,90 );
        System.out.println(s2);
        System.out.println("Get total student count: "+ Student.getStudentCount());
    }
}
