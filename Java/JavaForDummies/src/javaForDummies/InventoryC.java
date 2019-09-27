package javaForDummies;

import java.text.NumberFormat;
import java.util.Scanner;

public class InventoryC {
    public static void main(String[] args) {
        final double boxPrice = 3.25;
        Scanner sc = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.print("How many boxes do we have? ");
        String numBoxesIn = sc.next();

        try {
            int numBoxes = Integer.parseInt(numBoxesIn);
            if (numBoxes < 0) {
                throw new IndexOutOfBoundsException();
            }

            System.out.print("The value is ");
            System.out.println(numBoxes * boxPrice);
        } catch (NumberFormatException e) {
            System.out.println("You did not entered valid integer number");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(numBoxesIn);
            System.out.println("? That's impossible!");
        }
        sc.close();
    }
}
