package javaForDummies;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DoPayroll {
    public static void main(String[] args) throws IOException {
        Scanner diskScanner = new Scanner(new File("F:\\Projects\\problem-solving\\Java\\JavaForDummies\\src\\javaForDummies\\EmployeeInfo.txt"));

        for (int empNum = 1; empNum <= 3; empNum++) {
            payOneEmployee(diskScanner);
        }
        diskScanner.close();
    }

    static void payOneEmployee(Scanner sc) {
        Employee anEmployee = new Employee();

        anEmployee.setName(sc.nextLine());
        anEmployee.setJobTitle(sc.nextLine());
        anEmployee.cutCheck(sc.nextDouble());
        sc.nextLine();
    }
}
