package javaForDummies;

import java.text.NumberFormat;
import java.util.Scanner;

public class Room {
    private int guests;
    private double rate;
    private boolean smoking;
    private static NumberFormat currency = NumberFormat.getCurrencyInstance();

    public void readRoom(Scanner sc) {
        guests = sc.nextInt();
        rate = sc.nextDouble();
        smoking = sc.nextBoolean();
    }

    public void writeRoom() {
        System.out.print(guests);
        System.out.print("\t");
        System.out.print(currency.format(rate));
        System.out.print("\t");
        System.out.println(smoking ? "yes" : "no");
    }
}
