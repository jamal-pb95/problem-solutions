package com.jaamaal.learningjava;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        System.out.println("Hello, World!");

//        Triangle triangleA = new Triangle(20, 22, 10, 12, 22);
//        Triangle triangleB = new Triangle(2, 22, 10, 12, 2);
//
//        System.out.println("Triangle A area is: " + triangleA.findArea());
//        System.out.println("Triangle B area is: " + triangleB.findArea());
//        System.out.println("Number of sides in our Triangle: " + Triangle.numOfSides);
        Student jamal = new Student("Md. Jamal", "Uddin", 2023, 3.67, "IT", "Male", 24);
        Student nahida = new Student("Nahida", "Akhter", 2021, 3.98, "MATS", "Female", 20);
        Student ummeHabiba = new Student("Umme", "Habiba", 2023, 4.00, "CMT", "Female", 17);

        System.out.println(jamal.fullName());
        System.out.println(jamal.incrementExpGradYear());
        System.out.println(jamal.incrementExpGradYear());
        System.out.println(jamal.expGradYear);
        System.out.println(nahida.fullName());
        System.out.println(ummeHabiba.fullName());
    }
}
