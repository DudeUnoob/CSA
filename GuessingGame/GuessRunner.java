package GuessingGame;
import java.util.Scanner;

public class GuessRunner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            Guess myGuess = new Guess();
            System.out.println("Choose a random letter");

            int tries = 0;
            boolean guessedCorrectly = false;

            while (tries < 4 && !guessedCorrectly) {
                tries++;
                System.out.println("\nTry #" + tries);
                System.out.print("Enter your guess: ");
                String userGuess = input.nextLine().toLowerCase();

                char convertGuesstoChar = userGuess.charAt(0);

                if (myGuess.checkLetter(convertGuesstoChar)) {
                    System.out.println("You guessed the correct letter: " + convertGuesstoChar);
                    guessedCorrectly = true;
                } else if (tries < 4) {
                    System.out.println("You have " + (4 - tries) + " tries left.");
                }
            }

            System.out.print("Do you want to play again? (y/n): ");
            String playAgainResponse = input.nextLine().toLowerCase();
            playAgain = playAgainResponse.equals("y");
        }
    }
}