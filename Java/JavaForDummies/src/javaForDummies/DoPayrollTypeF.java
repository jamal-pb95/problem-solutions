package javaForDummies;

public class DoPayrollTypeF {
    public static void main(String[] args) {
        FullTimeEmployee ftEmployee = new FullTimeEmployee();

        ftEmployee.setName("Jamal Uddin");
        ftEmployee.setJobTitle("Software Developer");
        ftEmployee.setWeeklySalary(5000.00);
        ftEmployee.setBenefitDeduction(500.00);
        ftEmployee.cutCheck(ftEmployee.findPaymentAmount());
        System.out.println();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
        partTimeEmployee.setName("Imran Fakhrul");
        partTimeEmployee.setJobTitle("Intern");
        partTimeEmployee.setHourlyRate(8.89);
        partTimeEmployee.cutCheck(partTimeEmployee.findPaymentAmount(19));
    }
}
