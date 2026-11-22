import java.util.Scanner;
import java.util.Random;

class JackpotGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int jackpot = random.nextInt(100) + 1;
        int attempts = 0;
        int guess;
        boolean won = false;

        System.out.println("===== JACKPOT NUMBER GUESSING GAME =====");
        System.out.println("Guess the number between 1 and 100");
        System.out.println();
        System.out.println("Select Difficulty:");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Difficult");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                attempts = 20;
                break;

            case 2:
                attempts = 10;
                break;

            case 3:
                attempts = 5;
                break;

            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        System.out.println("You have " + attempts + " attempts.");
        System.out.println();

        while (attempts > 0) {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess == jackpot) {
                System.out.println("Congratulations! You won 7 Crore!");
                won = true;
                break;
            } else {
                if (guess < jackpot) {
                    System.out.println("Hint: The jackpot number is HIGHER.");
                } else {
                    System.out.println("Hint: The jackpot number is LOWER.");
                }

                attempts--;

                System.out.println("Remaining attempts: " + attempts);
                System.out.println();
            }
        }

        if (won == false) {
            System.out.println("Sorry! You lost the game.");
            System.out.println("The jackpot number was: " + jackpot);
        }

        sc.close();
    }
}