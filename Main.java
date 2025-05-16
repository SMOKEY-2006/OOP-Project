

package com.mycompany.oop2;
import java.util.Scanner;

public class OOP2 {
    public static void main(String[] args) {

        Courses C1 = new Courses();
        Student S = new Student();
        Lecturer L = new Lecturer();

        Scanner S1 = new Scanner(System.in);
        while (true) {
            System.out.println("------------- Course Registration System -------------");
            System.out.println("Choose your rule:");
            System.out.println("1. Manager.");
            System.out.println("2. Lecturer.");
            System.out.println("3. Student.");
            System.out.println("4. Quit");
            System.out.print("Please enter your choice:");

            int Main_Choice = S1.nextInt();

            switch (Main_Choice) {
                case 1:
                    while (true) {
                        System.out
                                .println("------------------------------- Welcome Sir -------------------------------");
                        System.out.println("1. Add a Course.");
                        System.out.println("2. Add a Student.");
                        System.out.println("3. Add a Lecturer.");
                        System.out.println("4. Register a course for a student.");
                        System.out.println("5. Register a course for a lecturer.");
                        System.out.println("6. Display the complete list of courses.");
                        System.out.println("7. Display the complete list of students.");
                        System.out.println("8. Display the complete list of lecturers.");
                        System.out.println("9. Display a list of courses currently taken by a particular student.");
                        System.out.println("10. Display a list of courses currently taught by a particular lecturer.");
                        System.out.println("11. Main Menu.");
                        System.out.print("Enter the number of the operation you wish to proceed:");
                        int Manager_Choice = S1.nextInt();
                        S1.nextLine();

                        switch (Manager_Choice) {
                            case 1:
                                System.out.println("Please Enter the Name of the Course that you wish to ADD!");
                                C1.Add_Course(C1.name = S1.nextLine());
                                break;

                            case 2:
                                S.Add_Student();

                                break;

                            case 3:
                                L.Add_Lecturer();
                                break;

                            case 4:
                                C1.Display_Courses();
                                System.out.println(
                                        "Please Enter the ID [1-20] of the Student, And the Number of the Course!");
                                C1.Add_Course_Student(C1.ID = S1.nextInt(), C1.CRSE = S1.nextInt());
                                break;

                            case 5:
                                C1.Display_Courses();
                                System.out.println(
                                        "Please Enter the ID [1-20] of the Lecturer, And the Number of the Course!");
                                int x = S1.nextInt(), CRSE = S1.nextInt();
                                C1.Add_Course_Lecturer(x, CRSE);
                                break;

                            case 6:
                                C1.Display_Courses();
                                break;

                            case 7:
                                S.Display_All_Students();

                                break;

                            case 8:
                                L.Display_All_Lecturers();
                                break;

                            case 9:
                                System.out.println("Please Enter the ID of the Student!");
                                C1.Display_Courses_Student(C1.ID = S1.nextInt());
                                break;
                            case 10:
                                System.out.println("Please Enter the ID of the Lecturer!");
                                C1.Display_Courses_Lecturer(C1.ID = S1.nextInt());
                                break;

                            case 11:
                                break;

                            default:
                                System.out.println("Please enter a valid choice!!");
                                break;
                        }
                        if (Manager_Choice == 11) {
                            break;
                        }
                    }

                    break;

                case 2:
                    while (true) {
                        System.out.println(
                                "------------------------------- Welcome Doctor -------------------------------");
                        System.out.println("1. View my Courses.");
                        System.out.println("2. Main Menu.");
                        System.out.print("Enter the number of the operation you wish to proceed:");
                        int Doctor_Choice = S1.nextInt();

                        switch (Doctor_Choice) {
                            case 1:
                                System.out.println("Please Enter your ID!");
                                C1.Display_Courses_Lecturer(C1.ID = S1.nextInt());
                                break;

                            case 2:
                                break;

                            default:
                                System.out.println("Please enter a valid choice!!");
                                break;
                        }
                        if (Doctor_Choice == 2) {
                            break;
                        }
                    }

                    break;
                case 3:
                    while (true) {
                        System.out.println("------------------------------- WELCOME -------------------------------");
                        System.out.println("1. View my Courses.");
                        System.out.println("2. Activities.");
                        System.out.println("3. Prizes.");
                        System.out.println("4. Main Menu.");
                        System.out.print("Enter the number of the operation you wish to proceed:");
                        int Student_Choice = S1.nextInt();
                        switch (Student_Choice) {
                            case 1:

                                System.out.println("Please Enter your ID!");
                                C1.Display_Courses_Student(C1.ID = S1.nextInt());

                                break;
                            case 2:
                                Activities act = new Activities();
                                act.menu();
                                break;

                            case 3:
                                Prizes prize = new Prizes();
                                prize.menu();
                                break;

                            case 4:
                                break;
                            default:
                                System.out.println("Please enter a valid choice!!");
                                break;
                        }
                        if (Student_Choice == 4) {
                            break;
                        }

                    }
                case 4:

                    break;

                default:
                    break;
            }
            if (Main_Choice == 4) {
                break;
            }
        }
    }
}
