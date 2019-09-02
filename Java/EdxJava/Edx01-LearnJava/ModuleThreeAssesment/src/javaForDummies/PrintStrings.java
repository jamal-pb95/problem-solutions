package javaForDummies;

import java.util.Scanner;

public class PrintStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = sc.next();
        System.out.print("Enter how many time you want to show your string? ");
        int num = sc.nextInt();
        printStrings(str, num);
    }

    public static void printStrings(String word, int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(word);
        }
    }
}
