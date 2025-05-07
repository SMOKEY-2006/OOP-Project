import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        Scanner S1 = new Scanner(System.in);

        while (true) {
        System.out.println("------------- Course Registration System -------------");
        System.out.println("1. Add a Course.");
        System.out.println("2. Add a Student.");
        System.out.println("3. Add a Lecturer.");
        System.out.println("4. Register a course for a student.");
        System.out.println("5. Register a course for a lecturer.");
        System.out.println("6. Display collage information.");
        System.out.println("7. Display the complete list of courses.");
        System.out.println("8. Display the complete list of students.");
        System.out.println("9. Display the complete list of lecturers.");
        System.out.println("10. Display a list of courses currently taken by a particular student.");
        System.out.println("11. Display a list of courses currently taught by a particular lecturer.");
        System.out.println("12. Quiz");
        System.out.print("Enter the number of the operation you wish to proceed:");

            int choose = S1.nextInt();
        switch (choose) {
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            case 6:
                
                break;
            case 7:
                
                break;
            case 8:
                
                break;
            case 9:
                
                break;
            case 10:
                
                break;
            case 11:
                
                break;
            case 12:

            default:
                break;
        }

        if (choose == 12) {
            break;
        }
        }
    }
}