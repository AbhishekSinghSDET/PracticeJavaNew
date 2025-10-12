package exceptionandfilehandling;

public class ExceptionHandling {

//    public static void main(String[] args) throws ArithmeticException{ // it will still not print Line 2 and Line 3
//        System.out.println("Line 1");
//        int a = 10/0;
//        System.out.println("Line 2");
//        System.out.println("Line 3");
//    }

    public static void main(String[] args){
        System.out.println("Line 1");
        try {
            int a = 10/0;
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Line 2");
        System.out.println("Line 3");
    }
}
