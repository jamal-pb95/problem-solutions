package com.bd.howtocode.java;

public class Exception2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        int result = 0;
        try {
            result = divide(a, b);
        } catch (ArithmeticException e) {
            System.out.println("You can not divide " + a + " by " + b + "!");
        }

        System.out.println("Result: " + result);
    }

    public static int divide(int a,  int b) {
        return a / b;
    }
}
