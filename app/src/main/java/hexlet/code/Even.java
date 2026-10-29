package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {

    public static void runEven(Scanner scanner) {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        boolean runEven = true;

        Random random = new Random();

        int correctAnswersCount = 0;

        while (runEven) {

            int number = random.nextInt(100);
            boolean numberIsEven = isEven(number);
            String correctAnswer = numberIsEven ? "yes" : "no";

            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if (answer.equals(correctAnswer)) {
                correctAnswersCount++;
                System.out.println("Correct!");
            } else {
                System.out.println(
                        "'"
                                + answer
                                + "' is wrong answer ;(. Correct answer was '"
                                + correctAnswer
                                + "'.");
                runEven = loseGame(name);
            }

            if (correctAnswersCount == 3) {
                System.out.println("Congratulations, " + name + "!");
                runEven = false;
            }
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean loseGame(String name) {
        System.out.println("Let's try again, " + name + "!");
        return false;
    }
}
