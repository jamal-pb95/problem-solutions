package hablu;

import java.io.File;
import java.util.Scanner;

public class DeleteEvidence {
    public static void main(String args[]) {
        File evidence = new File("cookedBooks.txt");
        Scanner keyboard = new Scanner(System.in);
        char reply;

        do {
            System.out.print("Delete evidence? (y/n) ");
            reply = keyboard.findWithinHorizon(".", 0).charAt(0);
        } while (reply != 'y' && reply != 'Y' && reply != 'N' && reply != 'n');

        if (reply == 'y' || reply == 'Y') {
            System.out.println("Okay, here goes...");
            evidence.delete();
            System.out.println("The evidence has been deleted.");
        } else {
            System.out.println("Sorry, buddy, just asking.");
        }
        keyboard.close();
    }
}
