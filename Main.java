import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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
                        System.out
                                .println("------------------------------- Welcome Sir -------------------------------");
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
                                break;

                            default:
                                break;
                        }
                        if (choose2 == 12) {
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
                        System.out.println("3. Activities");
                        System.out.println("4. My discount.");
                        System.out.println("5. Main Menu.");
                        System.out.print("Enter the number of the operation you wish to proceed:");
                        int choose4 = S1.nextInt();
                        switch (choose4) {
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
                            default:
                                break;
                        }
                        if (choose4 == 5) {
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