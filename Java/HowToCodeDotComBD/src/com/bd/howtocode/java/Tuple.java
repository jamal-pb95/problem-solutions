package com.bd.howtocode.java;

public class Tuple<X, Y> {
    private X x;
    private Y y;

    public Tuple(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    public X getX() {
        return x;
    }

    public Y getY() {
        return y;
    }

    public void showType() {
        System.out.println("Type of X is: " + x.getClass().getName() + " and value is: " + x);
        System.out.println("Type of Y is: " + y.getClass().getName() + " and value is: " + y);
    }

    public static void main(String[] args) {
        Tuple<String, String> tuple = new Tuple<String, String>("Hello ", "World!");
        tuple.showType();

        Tuple<String, Integer> person = new Tuple<String, Integer>("Jamal", 23);
        person.showType();

        Tuple<String, Tuple<Integer, Boolean>> me = new Tuple<String, Tuple<Integer, Boolean>>("Jamal", new Tuple<Integer, Boolean>(23, true));
        me.showType();

        Tuple<String, Tuple<Integer, Boolean>> me2 = new Tuple<>("Arafat", new Tuple<>(34, false));
        me2.showType();
    }
}
