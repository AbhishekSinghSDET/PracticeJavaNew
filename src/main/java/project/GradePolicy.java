package project;

public final class GradePolicy { // no one is going to inherit this class so make it as final
    public static final int A_PLUS;
    public static final int A_GRADE;
    public static final int B_PLUS;
    public static final int B_GRADE;
    public static final int C_PLUS;
    public static final int C_GRADE;
    public static final int D_PLUS;
    public static final int D_GRADE;
    public static final int PASSING_MARKS;

    private GradePolicy(){
        //created private constructor:
        //This is done so that we can access variables directly by using class name
        //No one is going to create object of this class
    }

    static {
        System.out.println("Grade Policy Loaded in the System");
        A_PLUS = 95;
        A_GRADE = 90;
        B_PLUS = 85;
        B_GRADE = 80;
        C_PLUS = 75;
        C_GRADE = 70;
        D_PLUS = 65;
        D_GRADE = 60;
        PASSING_MARKS = 33;
    }

    public static String calculateGrade(double percentage){
        if(percentage>=A_PLUS){
            return "A+";
        }
        if(percentage>=A_GRADE){
            return "A";
        }
        if(percentage>=B_PLUS){
            return "B+";
        }
        if(percentage>=B_GRADE){
            return "B";
        }
        if(percentage>=C_PLUS){
            return "C+";
        }
        if(percentage>=C_GRADE){
            return "C";
        }
        if(percentage>=D_PLUS){
            return "D+";
        }
        if(percentage>=D_GRADE){
            return "D";
        }

        return "F";

    }






}
