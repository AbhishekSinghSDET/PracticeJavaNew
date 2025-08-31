public class Child extends Parent{

    public static void add(){
        System.out.println("I am in child class");
    }
}

class Runner{
    public static void main(String[] args) {
        Parent t = new Child();
        t.add();
    }
}