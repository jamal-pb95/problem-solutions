package javaForDummies;

import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {
        makeTriangle();
    }

    public static void makeTriangle() {
        for (int i = 1; i < 8; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
