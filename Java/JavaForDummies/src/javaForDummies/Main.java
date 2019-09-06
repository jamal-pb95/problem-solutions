package javaForDummies;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("hello Dummies!");
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        boolean flag = false;
        // Write logic to find given number is divisible by 5 or not
        if (num % 5 == 0) {
            flag = true;
        }
        // Print flag value
        if(flag == false) {
            System.out.println("FALSE");
        } else {
            System.out.println("TRUE");
        }
    }
}
