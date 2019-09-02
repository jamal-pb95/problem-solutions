package javaForDummies;

import java.util.Scanner;

public class WriteNumbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        writeNumbs(number);
    }

    public static void writeNumbs(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        } else if (n == 1) {
            System.out.print(1);
            return;
        }

        writeNumbs(n - 1);
        System.out.print(", " + n);
    }
}
