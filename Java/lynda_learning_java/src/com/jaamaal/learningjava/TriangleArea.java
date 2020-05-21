package com.jaamaal.learningjava;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        // welcome screen
        System.out.println("Let's calculate area of a triangle based on user given base and height");

        // ask user to enter base and height
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter base of the triangle (in inches): ");
        double base = scanner.nextDouble();

        // check user base input is greater than zero
        while (base <= 0) {
            System.out.print("Invalid base! Please input the base of the triangle (in inches): ");
            base = scanner.nextDouble();
        }

        System.out.print("Please enter height of the triangle (in inches): ");
        double height = scanner.nextDouble();

        // check user height input is greater than zero
        while (height <= 0) {
            System.out.print("Invalid height! Please enter the height of the triangle (in inches): ");
            height = scanner.nextDouble();
        }

        double area = (base * height) / 2;
        System.out.println("The area of this triangle is: " + area + " which base: " + base + " and height: " + height + ".");
    }
}
