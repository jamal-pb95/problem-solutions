package javaForDummies;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        mystery1(1);
//        mystery1(4);
//        mystery1(16);
//        mystery1(30);
//        mystery1(100);
//        mystery2(113);
//        mystery2(70);
//        mystery2(42);
//        mystery2(30);
//        mystery2(10);
//        mystery3(0);
//        mystery3(1);
//        mystery3(2);
//        mystery3(4);
        mystery3(5);
    }

    public static void mystery1(int n) {
        if (n <= 1) {
            System.out.print(n);
        } else {
            mystery1(n / 2);
            System.out.print(", " + n);
        }
    }

    public static void mystery2(int n) {
        if (n > 100) {
            System.out.print(n);
        } else {
            mystery2(2 * n);
            System.out.print(", " + n);
        }
    }

    public static void mystery3(int n) {
        if (n <= 0) {
            System.out.print("*");
        } else if (n % 2 == 0) {
            System.out.print("(");
            mystery3(n - 1);
            System.out.print(")");
        } else {
            System.out.print("[");
            mystery3(n - 1);
            System.out.print("]");
        }
    }
}
