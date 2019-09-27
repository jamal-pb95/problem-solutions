package javaForDummies;

import java.text.NumberFormat;
import java.util.Scanner;

public class InventoryLoop {
    public static void main(String[] args) {
        final double boxPrice = 3.25;
        boolean gotGoodsInput = false;
        Scanner sc = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        do {
            System.out.print("How many boxes do we have? ");
            String numBoxesIn = sc.next();

            try {
                int numBoxes = Integer.parseInt(numBoxesIn);
                System.out.print("The value is ");
                System.out.println(currency.format(numBoxes * boxPrice));
                gotGoodsInput = true;
            } catch (NumberFormatException e) {
                System.out.println();
                System.out.println("That's not a number.");
            }
        } while (!gotGoodsInput);
        System.out.println("That's that.");
        sc.close();
    }
}
