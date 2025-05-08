import java.util.Scanner;

public class Student extends DMAP {
    private String Major;
    private String gender;

    public Student() {

    }

    public Student(String name, String Address, String Email, int ID, int age, String Major, String gender) {
        super(name, Address, Email, ID, age);
        this.Major = Major;
        this.gender = gender;

    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void StudentInfo() {
        System.out.println("Please enter your name:");
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
        System.out.println("Please enter your address:");
        this.Address = sc.nextLine();
        System.out.println("Please enter your email:");
        this.Email = sc.nextLine();
        System.out.println("Please enter your ID:");
        this.ID = sc.nextInt();
        
        while (true) {
            System.out.println("Please enter your age:");
            if (age < 0) {
                System.out.println("Invalid Age!");
            } else {
                this.age = sc.nextInt();
                break;
            }
        }
        System.out.println("please enter your Major");
        this.Major = sc.nextLine();
        System.out.println("please enter your Gender");
        this.gender = sc.nextLine();
        
    }

    public void displayStudentInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.Address);
        System.out.println("Email: " +this.Email);
        System.out.println("ID: " + this.ID);
        System.out.println("Age: " + this.age);
        System.out.println("Major: " + this.Major);
        System.out.println("Gender: " + this.gender);
    }

}
