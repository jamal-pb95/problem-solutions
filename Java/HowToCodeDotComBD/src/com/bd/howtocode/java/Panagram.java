package com.bd.howtocode.java;

import java.util.Scanner;

public class Panagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sentence: ");
        String inputString = sc.nextLine();

        if (inputString != null && inputString.length() > 0) {
            System.out.print("The given string, \"" + inputString + "\", is " + (isPanagram(inputString) ? "" : ("not ")) + "a Panagram");
        } else {
            System.out.print("Not a valid string!");
        }
    }

    private static boolean isPanagram(String inputString) {

        if (inputString.length() < 26) {
            return false;
        }

        inputString = inputString.toLowerCase();

        for (char i = 'a'; i <= 'z'; i++) {
            if (!(inputString.contains(i + ""))) {
                return false;
            }
        }

        return true;
    }
}
