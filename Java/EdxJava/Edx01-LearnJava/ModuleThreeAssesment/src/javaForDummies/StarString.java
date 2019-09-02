package javaForDummies;

import java.util.Scanner;

public class StarString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(starString(num));
    }

    public static String starString(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The value less than zero!");
        } else {
            double times = Math.pow(2, n);
            String s = "";
            for (int i = 0; i < times; i++) {
                s += "*";
            }
            return s;
        }
    }
}
