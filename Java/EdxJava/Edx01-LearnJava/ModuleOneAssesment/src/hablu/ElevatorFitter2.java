package hablu;

public class ElevatorFitter2 {
    public static void main(String[] args) {
        System.out.println("True ot False");
        System.out.println("You can fit all ten of them");
        System.out.println("Brickenchicker decuptelse");
        System.out.println("on the elevator:");
        System.out.println();

        int weightOfAPerson = 150;
        int elevatorWeightLimit = 1400;
        int numberOfPerson = elevatorWeightLimit / weightOfAPerson;

        boolean allTenOkay = numberOfPerson>= 10;

        System.out.println(allTenOkay);
    }
}