package project;

public class Student {

    private String name;
    private int age;
    private int rollNumber;
    private double marksObtainedInEnglish;
    private double marksObtainedInMaths;
    private double marksObtainedInScience;
    private double totalMarks;
    private double percentage;
    private String grade;
    private static int studentCount = 0;


    public Student(String name, int age, int rollNumber, double marksObtainedInEnglish,
                   double marksObtainedInMaths, double marksObtainedInScience) {

        if(validateAge(age) && validateRollNumber(rollNumber) && validateMarks(marksObtainedInEnglish)
                && validateMarks(marksObtainedInMaths) && validateMarks(marksObtainedInScience)) {
            this.name = name;
            this.age = age;
            this.rollNumber = rollNumber;
            this.marksObtainedInEnglish = marksObtainedInEnglish;
            this.marksObtainedInMaths = marksObtainedInMaths;
            this.marksObtainedInScience = marksObtainedInScience;
            studentCount++;
        }
    }

    private boolean validateAge(int age){
        if(age>0){
            return true;
        }
        else {
            System.out.println("Invalid Age");
            return false;
        }
    }

    private boolean validateRollNumber(int rollNumber){
        if(rollNumber>0){
            return true;
        }
        else {
            System.out.println("Invalid Roll Number");
            return false;
        }
    }

    private boolean validateMarks(double marksFortheSubject){
        if(marksFortheSubject < 100 || marksFortheSubject >0){
            return true;
        }
        else {
            System.out.println("Invalid Marks");
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 10 && age <65) {
            this.age = age;
        }
        else {
            System.out.println("Invalid Age");
        }
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        if(validateRollNumber(rollNumber)) {
            this.rollNumber = rollNumber;
        }
        else {
            System.out.println("Invalid Roll Number");
        }
    }

    public double getMarksObtainedInEnglish() {
        return marksObtainedInEnglish;
    }

    public void setMarksObtainedInEnglish(double marksObtainedInEnglish) {
        if(marksObtainedInEnglish > 0 || marksObtainedInEnglish < 100) {
            this.marksObtainedInEnglish = marksObtainedInEnglish;
        }
        else {
            System.out.println("Invalid Marks in English");
        }
    }

    public double getMarksObtainedInMaths() {
        return marksObtainedInMaths;
    }

    public void setMarksObtainedInMaths(double marksObtainedInMaths) {
        if(marksObtainedInMaths > 0 || marksObtainedInMaths<100) {
            this.marksObtainedInMaths = marksObtainedInMaths;
        }
        else {
            System.out.println("Invalid Marks in Maths");
        }
    }

    public double getMarksObtainedInScience() {
        return marksObtainedInScience;
    }

    public void setMarksObtainedInScience(double marksObtainedInScience) {
        if(marksObtainedInScience > 0 || marksObtainedInScience < 100) {
            this.marksObtainedInScience = marksObtainedInScience;
        }
        else {
            System.out.println("Invalid Marks in Science");
        }
    }

    public double getTotalMarks() {
        return totalMarks;
    }


    public double getPercentage() {
        return percentage;
    }


    public String getGrade() {
        return grade;
    }


    public final double calculateTotalMarks(){
        return totalMarks = marksObtainedInEnglish + marksObtainedInMaths + marksObtainedInScience;

    }

    public final double calculatePercentage(){
        return percentage = totalMarks/3;
    }

    public final String calculateGrade(){
        if(percentage==0){
            grade = "Grade cannot be calculated";
        }else {
            grade = GradePolicy.calculateGrade(percentage);
        }
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNumber=" + rollNumber +
                ", marksObtainedInEnglish=" + marksObtainedInEnglish +
                ", marksObtainedInMaths=" + marksObtainedInMaths +
                ", marksObtainedInScience=" + marksObtainedInScience +
                ", totalMarks=" + calculateTotalMarks() +
                ", percentage=" + calculatePercentage() +
                ", grade='" + calculateGrade() + '\'' +
                '}';
    }


    public static int getStudentCount(){
        return studentCount;
    }
}
