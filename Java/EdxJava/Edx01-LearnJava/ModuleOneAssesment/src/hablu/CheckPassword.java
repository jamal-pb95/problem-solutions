package hablu;

import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args) {
        System.out.print("What's the password? ");

        Scanner keyboard = new Scanner(System.in);
        String password = keyboard.next();

        System.out.println("You typed >>" + password + "<<");
        System.out.println();

        if(password == "swordfish") {
            System.out.println("The word you typed is stored");
            System.out.println("in the same place as the real");
            System.out.println("password. You must be a");
            System.out.println("hacker.");
        } else {
            System.out.println("The word you typed is not");
            System.out.println("stored in the same place as");
            System.out.println("the real password. but that's");
            System.out.println("not a big deal!");
        }
        System.out.println();

        if(password.equals("swordfish")) {
            System.out.println("The word you typed is stored");
            System.out.println("in the same place as the real");
            System.out.println("password. You can use our");
            System.out.println("precious system");
        } else {
            System.out.println("The word you typed is not");
            System.out.println("stored in the same place as");
            System.out.println(" the real password. You can not");
            System.out.println("use our precious system.");
        }
    }
}
