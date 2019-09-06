package hablu;

import javax.swing.JOptionPane;

public class Authenticator {
    public static void main(String args[]) {
        String username = JOptionPane.showInputDialog("Username: ");
        String password = JOptionPane.showInputDialog("Password: ");

        if(
                username != null &&
                password != null &&
                (username.equals("jamal") && password.equals("hablu")) || (username.equals("Jamal") && password.equals("bolod"))
        ) JOptionPane.showMessageDialog(null, "You are in");
        else JOptionPane.showMessageDialog(null, "You are suspicious");
    }
}
