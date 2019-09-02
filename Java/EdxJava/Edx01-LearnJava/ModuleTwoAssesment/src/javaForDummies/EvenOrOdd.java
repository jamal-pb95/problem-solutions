package javaForDummies;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Type a number: ");
        int inputNumber = keyboard.nextInt();
        System.out.println(inputNumber % 2 == 0 ? "even" : "odd");
    }
}
