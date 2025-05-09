import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Courses C1 = new Courses();
        Student S = new Student();
        
        System.out.println(Arrays.toString(C1.courses2));
        Scanner S1 = new Scanner(System.in);
        while (true) {
            System.out.println("------------- Course Registration System -------------");
            System.out.println("Choose your rule:");
            System.out.println("1. Manager.");
            System.out.println("2. Lecturer.");
            System.out.println("3. Student.");
            System.out.println("4. Quit");
            System.out.print("Please enter your choice:");

            int choose1 = S1.nextInt();

            switch (choose1) {
                case 1:
                    while (true) {
                        System.out.println("------------------------------- Welcome Sir -------------------------------");
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
                        System.out.println("12. Main Menu.");
                        System.out.print("Enter the number of the operation you wish to proceed:");
                        int choose2 = S1.nextInt();

                                switch (choose2) {
                                    case 1:
                                        System.out.println("Please Enter the Name of the Course that you wish to ADD!");
                                        C1.Add_Course(C1.name=S1.next());
                            case 2:
                            S.StudentInfo();

                                break;
                            case 3:

                                break;
                            case 4:
                                    System.out.println(Arrays.toString(C1.courses2));
//                                    System.out.println("Good day! You have a bunch of courses that could be added, as follows:");
//                                    System.out.println("1. Mathematics");
//                                    System.out.println("2. Physics");
//                                    System.out.println("3. English");
//                                    System.out.println("4. Arabic");
//                                    System.out.println("5. Computer Programming");
//                                    System.out.println("6. Object Oriented Programming");
//                                    System.out.println("7. Mathematics for Computer Science");
//                                    System.out.println("8. Game Programming");
//                                    System.out.println("9. Web Programming");
//                                    System.out.println("10. Multimedia Systems");                                     
//                                    System.out.println("11. Database");
//                                    System.out.println("12. Human Computer Interaction");
                                    System.out.println("Please Enter the ID [1-20] of the Student, And the Number of the Course within ONE LINE!");
                                    C1.Add_Course_Student(C1.ID=S1.nextInt(),C1.CRSE=S1.nextInt());
                                    
                                break;
                            case 5:

                                break;
                            case 6:

                                break;
                            case 7:
                            C1.Display_Courses();

                                break;
                            case 8:
                                S.displayStudentInfo();

                                break;
                            case 9:

                                break;
                            case 10:

                                break;
                            case 11:

                                break;
                            case 12:
                                break;

                            default:
                                break;
                        }
                        if (choose2==12){
                            break;
                        }
                    }
            
                    break;

                case 2:
                    while (true) {
                        System.out.println(
                                "------------------------------- Welcome Doctor -------------------------------");
                        System.out.println("1. View my Courses.");
                        System.out.println("2. View my schedule.");
                        System.out.println("3. Main Menu.");
                        System.out.print("Enter the number of the operation you wish to proceed:");
                        int choose3 = S1.nextInt();
                        switch (choose3) {
                            case 1:

                                break;
                            case 2:

                                break;
                            case 3:

                                break;

                            default:
                                break;
                        }
                        if (choose3 == 3) {
                            break;
                        }
                    }

                    break;
                case 3:
                    while (true) {
                        System.out.println("------------------------------- WELCOME -------------------------------");
                        System.out.println("1. View my Courses.");
                        System.out.println("2. View my debts.");
                        System.out.println("3. Activities.");
                        System.out.println("4. Prizes.");
                        System.out.println("5. Main Menu.");
                        System.out.print("Enter the number of the operation you wish to proceed:");
                        int choose4 = S1.nextInt();
                        switch (choose4) {
                            case 1:
                                break;
                            case 2:

                                break;
                            case 3:
                            Activities act = new Activities();
                            act.menu();
                                break;
                            case 4:
                            Prizes prize = new Prizes();
                            prize.menu();
                                break;
                            case 5:
                                break;
                            default:
                                break;
                        }
                        if (choose4 == 4) {
                            break;
                        }

                    }
                case 4:

                    break;

                default:
                    break;
            }
            if (choose1 == 4) {
                break;
            }
        }
    }
 }
