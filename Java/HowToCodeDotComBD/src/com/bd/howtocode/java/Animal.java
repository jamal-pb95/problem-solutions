package com.bd.howtocode.java;

public class Animal {
    String name;
    String color;

    public Animal(String animalName, String animalColor) {
        this.name = animalName;
        this.color = animalColor;
    }

    public void showName() {
        System.out.println("This animal name is " + this.name);
    }

    public void showColor() {
        System.out.println("The " + this.name + " animal color is " + this.color);
    }
}
