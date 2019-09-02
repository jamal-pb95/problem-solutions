package javaForDummies;

import java.util.Scanner;

public class DigitNumbers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num = keyboard.nextInt();
        if (num < 10) System.out.println("1-digit Number");
        else if (num < 100) System.out.println("2-digit Number");
        else System.out.println("3-digit Number");
    }
}
