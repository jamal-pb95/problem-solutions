package javaForDummies;

import java.util.Scanner;

public class DivisionMark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  num = sc.nextInt();
        boolean flag = false;
        // Write the logic to check the given number is divisible or not.
        if((num % 2 != 0 || num % 3 != 0) && (num % 5 == 0 && num % 10 == 0)) {
            flag = true;
        }

        System.out.println(flag == false ? "False" : "True");
    }
}
