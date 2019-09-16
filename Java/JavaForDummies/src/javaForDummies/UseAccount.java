package javaForDummies;

public class UseAccount {
    public static void main(String[] args) {
        Account myAccount = new Account();
        Account yourAccount = new Account();

        myAccount.setName("Barry Burd");
        myAccount.setAddress("222 Cyberspace Lane");
        myAccount.setBalance(24.02);

        yourAccount.setName("Jamal Uddin");
        yourAccount.setAddress("Dhaka, Bangladesh");
        yourAccount.setBalance(50.89);

        myAccount.display();

        System.out.print(" plus $");
        System.out.print(myAccount.getInterest(5.00));
        System.out.println(" interest ");

        yourAccount.display();

        double yourInterestRate = 7.00;
        System.out.print(" plus $");
        double yourInterestAmount = yourAccount.getInterest(yourInterestRate);
        System.out.print(yourInterestAmount);
        System.out.println(" interest ");
    }
}
