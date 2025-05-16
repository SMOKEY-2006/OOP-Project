import java.util.Scanner;

public class Lecturer extends DMAP {
    private String Rank;
    private String gender;
    private int CurrentLecturer = 0;
    String[][] Lecturers = new String[100][7];
    Scanner sc = new Scanner(System.in);

    public Lecturer() {

    }

    public Lecturer(String name, String Address, String Email, int ID, int age, String Rank, String gender) {
        super(name, Address, Email, ID, age);
        this.Rank = Rank;
        this.gender = gender;


    }

    public String getRank() {
        return Rank;
    }

    public void setRank(String Rank) {
        this.Rank = Rank;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public void Add_Lecturer() {
        // A Condition for the scanner problem.
        if (CurrentLecturer >= 1 ) 
            sc.nextLine();
        
            System.out.print("please enter your name:");
            Lecturers[CurrentLecturer][0] = sc.nextLine();

            System.out.print("please enter your address:");
            Lecturers[CurrentLecturer][1] = sc.nextLine();

            System.out.print("please enter your email:");
            Lecturers[CurrentLecturer][2] = sc.next();

            System.out.print("please enter your ID:");
            Lecturers[CurrentLecturer][3] = sc.next();

            System.out.print("please  enter your age:");
            Lecturers[CurrentLecturer][4] = sc.next();

            System.out.print("please enter your Rank:");
            Lecturers[CurrentLecturer][5] = sc.next();

            System.out.print("please enter your Gender:");
            Lecturers[CurrentLecturer][6] = sc.next();

            CurrentLecturer++;
        
    }

    
    public void Display_All_Lecturers(){
        for (int i = 0; i < CurrentLecturer; i++) {
            System.out.println("\nLecturer " + ( i + 1 ) + ":");
            System.out.println("Name: " + Lecturers[i][0]);
            System.out.println("Address: " + Lecturers[i][1]);
            System.out.println("Email: " + Lecturers[i][2]);
            System.out.println("ID: " + Lecturers[i][3]);
            System.out.println("Age: " + Lecturers[i][4]);
            System.out.println("Rank: " + Lecturers[i][5]);
            System.out.println("Gender: " + Lecturers[i][6]);
            line();
        }
    }
    
    
    // A line for the structure of display.
    public void line(){
        for (int i = 0; i < 20; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
    
}
