package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        String selectedMenuItem = scanner.nextLine();

        try {
            int choice = Integer.parseInt(selectedMenuItem);

            switch (choice) {
                case 1 -> Cli.greet();
                case 2 -> Even.runEven(scanner);
                case 0 -> {}
                default -> System.out.println("Invalid menu choice");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid menu choice");
        }
    }
}
