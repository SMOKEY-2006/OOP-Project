import java.util.ArrayList;
import java.util.Scanner;

public class Prizes {
    ArrayList<String> prizes = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("\n--- Prizes Menu ---");
            System.out.println("1. View Prizes");
            System.out.println("2. Add Prize");
            System.out.println("3. Back to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine(); 

            if (choice == 1) {
                showPrizes();
            } else if (choice == 2) {
                addPrize();
            } else if (choice == 3) {
                break; // exit to main menu
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public void showPrizes() {
        if (prizes.size() == 0) {
            System.out.println("You Don't Have Prizes Yet.");
        } else {
            System.out.println("Your Prizes:");
            for (int i = 0; i < prizes.size(); i++) {
                System.out.println((i + 1) + ". " + prizes.get(i));
            }
        }
    }

    public void addPrize() {
        System.out.print("Enter prize : ");
        String prize = input.nextLine();
        prizes.add(prize);
        System.out.println("Prize added Succesfully.");
    }
}