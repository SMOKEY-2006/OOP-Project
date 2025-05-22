import java.util.Scanner;

public class  Student extends DMAP {
    private String Major;
    private String gender;
    private int CurrentStudent = 0;
    String[][] Students = new String[100][7];
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


    public void Add_Student() {
        // A Condition for the scanner problem.
        if (CurrentStudent >= 1 ) 
            sc.nextLine();
        
            System.out.print("please enter your name:");
            Students[CurrentStudent][0] = sc.nextLine();

            System.out.print("please enter your address:");
            Students[CurrentStudent][1] = sc.nextLine();

            System.out.print("please enter your email:");
            Students[CurrentStudent][2] = sc.next();

            System.out.print("please enter your ID:");
            Students[CurrentStudent][3] = sc.next();

            System.out.print("please  enter your age:");
            Students[CurrentStudent][4] = sc.next();

            System.out.print("please enter your Major:");
            Students[CurrentStudent][5] = sc.next();

            System.out.print("please enter your Gender:");
            Students[CurrentStudent][6] = sc.next();

            CurrentStudent++;
        
    }

    
    public void Display_All_Students(){
        for (int i = 0; i < CurrentStudent; i++) {
            System.out.println("\nStudent " + ( i + 1 ) + ":");
            System.out.println("Name: " + Students[i][0]);
            System.out.println("Address: " + Students[i][1]);
            System.out.println("Email: " + Students[i][2]);
            System.out.println("ID: " + Students[i][3]);
            System.out.println("Age: " + Students[i][4]);
            System.out.println("Major: " + Students[i][5]);
            System.out.println("Gender: " + Students[i][6]);
            line();
        }
    }
    
                                             
    public void line(){
        for (int i = 0; i < 20; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

}




