<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Scanner;

public class Student extends DMAP {
    private String major;
    private String gender;

    public Student() {}

    public Student(String name, String address, String email, int ID, int age, String major, String gender) {
        super(name, address, email, ID, age);
        this.major = major;
        this.gender = gender;
    }

    public String getMajor() {
        return major;
=======
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
>>>>>>> e46717e2103732fa81135241c80425e67463a6d1
    }

    public String getGender() {
        return gender;
    }

<<<<<<< HEAD
    public void setMajor(String major) {
        this.major = major;
    }

=======
>>>>>>> e46717e2103732fa81135241c80425e67463a6d1
    public void setGender(String gender) {
        this.gender = gender;
    }

<<<<<<< HEAD


=======
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
            int age = sc.nextInt();
            if (age < 0) {
                System.out.println("Invalid Age!");
            } else {
                this.age = age;
                break;
            }
        }
        
        System.out.println("please enter your Major");
        this.Major = sc.next(); // I deleted the nextline() cuz it wasn't working with me ... if it was working with you type it again. *
        System.out.println("please enter your Gender");
        this.gender = sc.next(); // I deleted the nextline() cuz it wasn't working with me ... if it was working with you type it again. *
        
    }

    public void displayStudentInfo(){
        // *just an idea if you can format it this way :System.out.println("|        NAME        |" + "        ADDRESS        |" + "        EMAIL        |" + "        ID        |" + "        AGE        |" + "        MAJOR        |" + "        GENDER        |");
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.Address);
        System.out.println("Email: " +this.Email);
        System.out.println("ID: " + this.ID);
        System.out.println("Age: " + this.age);
        System.out.println("Major: " + this.Major);
        System.out.println("Gender: " + this.gender);
    }

}
>>>>>>> e46717e2103732fa81135241c80425e67463a6d1
