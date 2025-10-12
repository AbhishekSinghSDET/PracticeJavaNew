package exceptionandfilehandling;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if(validateAge(age)) {
            this.name = name;
            this.age = age;
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
        if(validateAge(age)){
            this.age = age;
        }

    }

    public boolean validateAge(int age){
        if(age>0 && age<100){
            return true;
        }
        else {

        }
        try {
            throw new InvalidAgeException("Invalid Age");
        } catch (InvalidAgeException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
