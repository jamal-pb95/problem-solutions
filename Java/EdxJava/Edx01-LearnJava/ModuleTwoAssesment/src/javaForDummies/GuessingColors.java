package javaForDummies;

import java.util.Scanner;

public class GuessingColors {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What color do you want? ");
        String color = keyboard.next();
        switch (color.toLowerCase()) {
            case "r":
                System.out.println("You have chosen Red.");
                break;
            case "b":
                System.out.println("You have chosen Blue.");
                break;
            case "g":
                System.out.println("You have chosen Green.");
                break;
            default:
                System.out.println("Unknown color: " + color);
                break;
        }
    }
}
