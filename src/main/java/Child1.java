public class Child1 extends Parent1 {

    public void add(){
        System.out.println("I am in child class");
    }

    public static void main(String[] args) {
        Parent1 p = new Child1();
        p.add();
    }
}
