import java.util.ArrayList;
import java.util.Scanner;

public class Activities {
    ArrayList<String> activities = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("\n--- Activities Menu ---");
            System.out.println("1. View Activities");
            System.out.println("2. Add Activity");
            System.out.println("3. Back to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine(); // clear the buffer

            if (choice == 1) {
                showActivities();
            } else if (choice == 2) {
                addActivity();
            } else if (choice == 3) {
                break; // exit to main menu
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public void showActivities() {
        if (activities.size() == 0) {
            System.out.println("No activities found.");
        } else {
            System.out.println("Your Activities:");
            for (int i = 0; i < activities.size(); i++) {
                System.out.println((i + 1) + ". " + activities.get(i));
            }
        }
    }

    public void addActivity() {
        System.out.print("Enter activity name: ");
        String activity = input.nextLine();
        activities.add(activity);
        System.out.println("Activity Added Succesfully .");
    }
}
