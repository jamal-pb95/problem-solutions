package com.jaamaal.princeton.java;

import java.util.Scanner;

/******************************************************************************
 *  Compilation:  javac UseArgument.java
 *  Execution:    java UseArgument
 *
 *  Prints "Hi, Bob. How are you?" where "Bob" is replaced by the
 *  command-line argument.
 *
 *  % java UseArgument Bob
 *  Hi, Bob. How are you?
 *
 *  % java UseArgument Alice
 *  Hi, Alice. How are you?
 *
 ******************************************************************************/

public class UseArguments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.print("Hi, ");
        System.out.print(name);
        System.out.println(". How are you?");
    }
}
