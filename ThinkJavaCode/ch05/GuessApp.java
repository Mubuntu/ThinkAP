import java.util.Random;
import java.util.Scanner;

/**
 * Created by Mubuntu on 15/02/2017.
 * Now that we have conditional statements, we can get back to
 * the “Guess My Number” game from Exercise 3.4.
 * You should already have a program that chooses a random number, prompts
 * the user to guess it, and displays the difference between the guess and the
 * chosen number.
 * Adding a small amount of code at a time, and testing as you go, modify the
 * program so it tells the user whether the guess is too high or too low, and then
 * prompts the user for another guess.
 * The program should continue until the user gets it right. Hint: Use two
 * methods, and make one of them recursive
 */
public class GuessApp {
    private static int counter = 0;

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        checkGuess(randomNumber);
    }

    private static void checkGuess(int randomNumber) {


        Scanner sc = new Scanner(System.in);
        System.out.println("guess a number between 1-10");
        int guessedNumber;
        if (!sc.hasNextInt()) {
            String word = sc.next();
            System.err.println(word + " is not a number");
            return;
        }
        guessedNumber = sc.nextInt();
        generateRandom(guessedNumber, randomNumber);
    }

    private static void generateRandom(int guessedNumber, int randomNumber) {
        if (guessedNumber == randomNumber) {
            System.out.println("jup you guessed it! your nunmber was: " + guessedNumber);
            System.out.println("you got it right after " + counter + " tries!");
            counter = 0;
        } else if (guessedNumber > randomNumber) {
            System.out.println("sorry your number was too high! try lowering it:  " + guessedNumber + " != " + randomNumber);
            counter++;
            checkGuess(randomNumber);
        } else {
            System.out.println("sorry your number was too low! try enlarging it:  " + guessedNumber + " != " + randomNumber);
            counter++;
            checkGuess(randomNumber);
        }

    }
}
