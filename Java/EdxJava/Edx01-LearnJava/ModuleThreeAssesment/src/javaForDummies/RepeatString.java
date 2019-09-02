package javaForDummies;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = sc.next();
        System.out.print("Enter number of times: ");
        int numTimes = sc.nextInt();

        System.out.println(repeat(str, numTimes));
    }

    public static String repeat(String s, int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Enter and positive int");
        } else if (num == 0) {
            s = "";
        } else {
            s += repeat(s, num - 1);
        }

        return s;
    }
}
