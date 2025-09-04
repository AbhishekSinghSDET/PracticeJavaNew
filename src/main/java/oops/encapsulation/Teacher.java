package oops.encapsulation;

public class Teacher {


    private String name;
    private int age;
    private String contactNumber;
    private String address;
    private String empID;
    private String subject;
    private int yearsOfExperience;
    private double salary;
    private static final double BASE_SALARY = 30000;
    private static final double EXPERIENCE_BONUS = 2000;


    public Teacher(String name,int age, String contactNumber, String address,String empID, String subject, int yearsOfExperience) {

        if (validateAge(age) && validateContactNumber(contactNumber)
                && validateAddress(address) && validateEmpID(empID) && validateSubject(subject) && validateExperience(yearsOfExperience)) {
            this.yearsOfExperience = yearsOfExperience;
            this.subject = subject;
            this.empID = empID;
            this.address = address;
            this.contactNumber = contactNumber;
            this.age = age;
            this.name = name;
            calculateSalary();
        }
    }

    public boolean validateAge(int age){
        if(age >=21 && age<=65){
            return true;
        }
        else {
            System.out.println("Invalid Teacher Age");
            return false;
        }
    }

    public boolean validateContactNumber(String contactNumber){
        if(contactNumber.matches("\\d{10}")){
            return true;
        }
        else {
            System.out.println("Invalid Teacher Contact Number");
            return false;
        }
    }


    public boolean validateAddress(String address){
        if(!address.isEmpty()){
            return true;
        }
        else {
            System.out.println("Invalid Teacher Addreess");
            return false;
        }
    }

    public boolean validateEmpID(String empID){
        if(empID.matches("T\\d{3}")){
            return true;
        }
        else {
            System.out.println("Invalid Teacher EmpID");
            return false;
        }
    }

    public boolean validateSubject(String subject){
        if(!subject.isEmpty()){
            return true;
        }
        else {
            System.out.println("Invalid Subject");
            return false;
        }
    }

    public boolean validateExperience(int yearsOfExperience){
        if(yearsOfExperience>0){
            return true;
        }
        else {
            System.out.println("Invalid Years of Experience");
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
        if(validateAge(age)) {
            this.age = age;
        }
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        if(validateContactNumber(contactNumber)) {
            this.contactNumber = contactNumber;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(validateAddress(address)) {
            this.address = address;
        }
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        if(validateEmpID(empID)) {
            this.empID = empID;
        }
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        if(validateSubject(subject)) {
            this.subject = subject;
        }
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        if(validateExperience(yearsOfExperience)) {
            this.yearsOfExperience = yearsOfExperience;
        }
    }

    public double getSalary() {
        return salary;
    }

    private void calculateSalary(){
        salary = BASE_SALARY + (yearsOfExperience * EXPERIENCE_BONUS);

    }

    public void displayTeacherInfo(){
        System.out.println("----Teacher Info------");
        System.out.println("EmpId: "+empID);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("ContactNo: "+contactNumber);
        System.out.println("Address: "+address);
        System.out.println("Subject: "+subject);
        System.out.println("YOE: "+yearsOfExperience);
        System.out.println("Salary: "+salary);
        System.out.println("=========================");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", contactNumber='" + contactNumber + '\'' +
                ", address='" + address + '\'' +
                ", empID='" + empID + '\'' +
                ", subject='" + subject + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", salary=" + salary +
                '}';
    }
}
