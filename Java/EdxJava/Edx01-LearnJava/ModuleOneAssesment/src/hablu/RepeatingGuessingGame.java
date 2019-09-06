package hablu;

import java.util.Random;
import java.util.Scanner;

public class RepeatingGuessingGame {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int numGuesses = 0;
        int randomNumber = new Random().nextInt(10) + 1;

        System.out.println("*****************************");
        System.out.println("Welcome to the guessing game!");
        System.out.println("*****************************\n");

        System.out.print("Enter an int from 1 to 10: ");
        int inputNumber = keyboard.nextInt();
        numGuesses++;

        while (inputNumber != randomNumber) {
            System.out.println();
            System.out.println("Try again......!");
            System.out.print("Enter an int from 1 to 10: ");
            inputNumber = keyboard.nextInt();
            numGuesses++;
        }

        System.out.println("\nYou win after " + numGuesses + " guesses.");
        keyboard.close();
    }
}
