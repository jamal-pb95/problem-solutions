package javaForDummies;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int inputNumber = keyboard.nextInt();
        int sum = 0;

        for(int i = 1; i <= inputNumber; i++) {
            sum += i;
        }

        System.out.println(sum);

    }
}
