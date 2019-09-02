package javaForDummies;

import java.util.Scanner;

public class StringExpCat {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next(); // Get String value
        String s2 = "cat"; // find the String from the above string
        // Write the logic to find the string from the given string
        System.out.println(s1.indexOf(s2) != -1 ? "Found" : "Not Found");
    }
}
