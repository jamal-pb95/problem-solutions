package com.jaamaal.learningjava;

import java.util.Scanner;

public class MealPrice {
    private static void calculateTotalMealPrice(double listedMealPrice,
                                                double tipRate,
                                                double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        System.out.println("Total meal price is: " + result);
    }

    public static void main(String[] args) {
        // enter user date
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the price of listed meals: ");
        double listedMealPrice = scanner.nextDouble();

        System.out.print("Please enter the tip rate of this restaurant: ");
        double tipRate = scanner.nextDouble();

        System.out.print("Please enter the tax rate: ");
        double taxRate = scanner.nextDouble();

        calculateTotalMealPrice(listedMealPrice, tipRate, taxRate);
    }
}
