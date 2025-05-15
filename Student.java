import java.util.ArrayList;
import java.util.Scanner;

public class  Student extends DMAP {
    private String Major;
    private String gender;
    protected int numberOfStudents;
    protected int studentDatasize;
    String[][] StUdents = new String[numberOfStudents][studentDatasize];
    Scanner sc = new Scanner(System.in);

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

    public void StudentsInfo() {
        System.out.println("please enter number of students you want to add");

        numberOfStudents = sc.nextInt();
        studentDatasize = 7;

        String Name = sc.next();


        System.out.println("\n please enter your name");


        System.out.println("please enter your address");

        String Address = sc.next();


        System.out.println("please enter your email");
        String Email = sc.nextLine();

        System.out.println("please enter your ID");

        String ID = sc.nextLine();

        System.out.println("please  enter your age");
        int age = sc.nextInt();

        System.out.println("\n please enter your Major");
        String Major = sc.next();

        System.out.println("please enter your Gender");
        String Gender = sc.next();


        {
            String[][] StUdents = new String[numberOfStudents][studentDatasize];
            for (int j = 0; j < numberOfStudents; j++) {
                StUdents[j][0] = name;
                StUdents[j][1] = Address;
                StUdents[j][2] = Email;
                StUdents[j][3] = "ID" + ID;
                StUdents[j][4] = "Age" + age;
                StUdents[j][5] = "Major" + Major;
                StUdents[j][6] = gender;
            }

            System.out.println("choose a display method");
            System.out.println("1/view all students");
            System.out.println("2/view one student");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(StUdents);
                    break;
                case 2:
                    System.out.println("enter number of students " + numberOfStudents);
                    int studentsNum = sc.nextInt();
                    if (studentsNum > 0 && studentsNum <= numberOfStudents) {

                        System.out.println(StUdents[studentsNum - 1]);
                    } else {
                        System.out.println("please enter a valid number");
                    }
                    break;
                default:
                    System.out.println("your choice is wrong");
            }
        }


    }
    //   public void displayStudents() {

    //   for (int i = 0; i <= StUdents.length; i++) {
    //         System.out.println((i+1) + ". " + StUdents[i][0]);

    //  }

//}

}




