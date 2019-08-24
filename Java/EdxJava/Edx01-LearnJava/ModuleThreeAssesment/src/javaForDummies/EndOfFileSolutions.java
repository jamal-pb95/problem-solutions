package javaForDummies;

import java.util.Calendar;
import java.util.Scanner;

public class EndOfFileSolutions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; sc.hasNext()== true; i++){
            System.out.println(i + " " + sc.nextLine());
        }

        Calendar cal = Calendar.getInstance();
        System.out.println(Calendar.DATE);
        }
    }
}
