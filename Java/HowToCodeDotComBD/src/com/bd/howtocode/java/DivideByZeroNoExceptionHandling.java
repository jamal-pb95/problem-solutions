package com.bd.howtocode.java;

import java.util.Scanner;

public class DivideByZeroNoExceptionHandling {
    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int num1 = sc.nextInt();
        System.out.print("Please enter another integer: ");
        int num2 = sc.nextInt();

        int result = divide(num1, num2);

        System.out.println(String.format("Result: %d / %d = %d", num1, num2, result));
    }
}
