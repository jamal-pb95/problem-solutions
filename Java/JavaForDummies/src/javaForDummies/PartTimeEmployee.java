package javaForDummies;

public class PartTimeEmployee extends Employee {
    private double hourlyRate;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double findPaymentAmount(int hours) {
        return hours * hourlyRate;
    }
}
