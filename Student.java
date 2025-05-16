import java.util.Scanner;

public class  Student extends DMAP {
    private String Major;
    private String gender;
    private int CurrentStudent;
    String[][] Students = new String[CurrentStudent][7];
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
        System.out.print("please enter number of students you want to add");
        int numberOfStudents = sc.nextInt();
        
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("\n please enter your name:");
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
    }

    public void Display_All_Students(){
        for (int i = 0; i < CurrentStudent; i++) {
            System.out.println("\nStudent " + i + ":");
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

    public void Display_One_Student(int Id){
        if (id > 1 && id <= CurrentStudent + 1) {
            System.out.println("\nStudent " + Students[id][0] + ":");
            System.out.println("Name: " + Students[id][0]);
            System.out.println("Address: " + Students[id][1]);
            System.out.println("Email: " + Students[id][2]);
            System.out.println("ID: " + Students[id][3]);
            System.out.println("Age: " + Students[id][4]);
            System.out.println("Major: " + Students[id][5]);
            System.out.println("Gender: " + Students[id][6]);
        }

        else
            System.out.println("Please enter a valid student ID !!");
    }

    public void line(){
        for (int i = 0; i < 20; i++) {
            System.out.print("-");
            System.out.println();
        }
    }

    //   public void displayStudents() {

    //   for (int i = 0; i <= StUdents.length; i++) {
    //         System.out.println((i+1) + ". " + StUdents[i][0]);

    //  }

//}

}




