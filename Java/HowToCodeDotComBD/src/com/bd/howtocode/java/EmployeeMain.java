package com.bd.howtocode.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Jamal", 23, 30000));
        list.add(new Employee(2, "Mushfiqur", 24, 28000));
        list.add(new Employee(3, "Imran", 25, 35000));
        list.add(new Employee(4, "Rakibul", 23, 20000));

        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee t, Employee t1) {
                return t.age - t1.age;
            }
        });

        list.forEach((x) -> {
            System.out.println(x.salary);
        });
    }
}
