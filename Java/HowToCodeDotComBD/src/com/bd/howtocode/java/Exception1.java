package com.bd.howtocode.java;

public class Exception1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        int result = divide(a, b);
        System.out.println("Result is: " + result);
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
