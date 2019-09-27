package javaForDummies;

import java.text.NumberFormat;
import java.util.Scanner;

public class InventoryB {
    public static void main(String[] args) {
        final double boxPrice = 3.45;
        Scanner sc = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.print("How many boxes do we have? ");
        String numBoxesIn = sc.next();

        try {
            int numBoxes = Integer.parseInt(numBoxesIn);
            System.out.print("The value is ");
            System.out.println(currency.format(numBoxes * boxPrice));
        } catch (NumberFormatException e) {
            System.out.println("Sorry! You did not entered valid integer number.");
            System.out.println("You entered: " + e.getMessage() + "***");
            e.getStackTrace();
        }
        sc.close();
    }
}
