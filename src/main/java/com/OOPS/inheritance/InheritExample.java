package com.OOPS.inheritance;

  class University {
    private String university="University Of Mumbai";
    private String location="Mumbai";

    void dispUniversityDetails(){
        System.out.println("University name: " + university);
        System.out.println("University location: " + location);
    }

}


class College extends University{
      private String name="Somaiya";
      private String location="Vidyavihar";

      void dispCollegeDEtails(){
          dispUniversityDetails();
          System.out.println("-----------------------\n");
          System.out.println("College name: " + name);
          System.out.println("College location: " + location);
      }
}


class Students extends College{
    private String name="Abhishek";

    void dispStudDetails(){
        dispCollegeDEtails();
        System.out.println("-----------------------\n");
        System.out.println("Student name: " + name);
    }
}


public class InheritExample {
    public static void main(String[] args) {
        Students s = new Students();
        s.dispStudDetails();
    }
}
