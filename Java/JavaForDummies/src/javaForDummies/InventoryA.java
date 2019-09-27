package javaForDummies;

import java.text.NumberFormat;
import java.util.Scanner;

public class InventoryA {
    public static void main(String[] args) {
        final double boxPrice = 3.25;
        Scanner sc = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.print("How many boxes do we have? ");
        String numBoxesIn = sc.next();
        int numBoxes = Integer.parseInt(numBoxesIn);

        System.out.print("The value is ");
        System.out.println(currency.format(numBoxes * boxPrice));
        sc.close();
    }
}
