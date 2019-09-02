package javaForDummies;

public class Truck extends Car {
    public void m1() {
        System.out.println("truck 1");
    }

    public void m2() {
        super.m1();
    }

    @Override
    public String toString() {
        return super.toString() + super.toString();
    }
}
