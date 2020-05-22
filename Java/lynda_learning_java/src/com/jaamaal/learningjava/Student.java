package com.jaamaal.learningjava;

public class Student {
    String firstName;
    String lastName;
    int expGradYear;
    double gpa;
    String declareMajor;
    String sex;
    int age;

    public Student(String firstName,
                   String lastName,
                   int expGradYear,
                   double gpa,
                   String declareMajor,
                   String sex,
                   int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expGradYear = expGradYear;
        this.gpa = gpa;
        this.declareMajor = declareMajor;
        this.sex = sex;
        this.age = age;
    }

    public int incrementExpGradYear() {
        return this.expGradYear += 1;
    }

    public String fullName() {
        return this.firstName + " " + this.lastName;
    }
}
