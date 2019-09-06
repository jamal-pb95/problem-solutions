package hablu;

import java.util.Scanner;

public class NestedAuthenticator {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Username: ");
        String username = keyboard.next();

        if (username.equals("jamal")) {
            System.out.print("Password: ");
            String password = keyboard.next();

            System.out.println(password.equals("hablu") ? "You're in." : "You're suspicious");
        } else {
            System.out.println("Unknown user.");
        }
        keyboard.close();
    }
}
