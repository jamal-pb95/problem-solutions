package com.bd.howtocode.java;

public class Cow extends Animal {
    private String work;

    public Cow(String cowName, String cowColor) {
        super(cowName, cowColor);
        this.work = "Gives Milk";
    }

    @Override
    public void showColor() {
        System.out.println("Before show color in child");
        super.showColor();
    }

    @Override
    public void showName() {
        super.showName();
        System.out.println("After show name in child");
    }

    public void showDescription() {
        this.showName();
        System.out.println("Animal work is " + this.work);
        this.showColor();
    }

    public static void main(String[] args) {
        Cow cow = new Cow("White Cow", "White");
        cow.showDescription();
    }
}
