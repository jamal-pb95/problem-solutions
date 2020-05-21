package com.jaamaal.learningjava;

import java.util.Scanner;

public class SalaryCalculator {
    private static double yearlySalaryCalculator(double weeklyWorkingHours,
                                                 double hourlyRate) {
        double weeklyTotalSalary = weeklyWorkingHours * hourlyRate;
        return weeklyTotalSalary * 52;
    }

    private static double vacationSalaryDeduction(int vacationDays,
                                                  double hourlyRate,
                                                  double weeklyWorkingHours) {
        double vacationDaysDeductionRate = hourlyRate * 8 * vacationDays;
        return yearlySalaryCalculator(hourlyRate, weeklyWorkingHours) - vacationDaysDeductionRate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weeklyTotalWorkingHours = scanner.nextDouble();
        double hourlyRate = scanner.nextDouble();
        int numberOfVacationDay = scanner.nextInt();

        double yearlyGrossSalary = vacationSalaryDeduction(numberOfVacationDay, hourlyRate, weeklyTotalWorkingHours);
        System.out.println("Yearly Gross Salary: " + yearlyGrossSalary);
    }
}
