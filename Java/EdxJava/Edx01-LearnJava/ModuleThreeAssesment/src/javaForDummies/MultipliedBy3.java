package javaForDummies;

import java.util.Scanner;

public class MultipliedBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double num1 = sc.nextDouble();

        method1(num1);
    }

    public static void method1(Double number) {
        method2(number.intValue());
    }

    public static void method2(int number) {
        System.out.println(number * 3);
    }
}
