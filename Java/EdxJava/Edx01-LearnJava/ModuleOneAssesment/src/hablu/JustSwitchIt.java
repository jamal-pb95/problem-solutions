package hablu;

import java.util.Scanner;

public class JustSwitchIt {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Which verse? ");

        int verse = keyboard.nextInt();

        switch (verse) {
            case 1:
                System.out.println("That's because he has no brain.");
                break;
            case 2:
                System.out.println("That's because he is a pain.");
                break;
            case 3:
                System.out.println("Cause this is the last refrain.");
                break;
            default:
                System.out.println("No, such verse. Please try again");
                break;
        }
        System.out.println("Ohh ............");
        keyboard.close();
    }
}
