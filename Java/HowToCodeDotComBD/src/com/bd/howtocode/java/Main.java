package com.bd.howtocode.java;

public class Main {
    private int initialNumber;
    private int terminalNumber;

    public Main(int initialNumber, int terminalNumber) {
        this.initialNumber = initialNumber;
        this.terminalNumber = terminalNumber;
    }

    public Main(int terminalNumber) {
        this(0, terminalNumber);
    }

    public Main() {
        this(0, 100);
    }

    public void showNumbers() {
        System.out.println("First number: " + this.initialNumber + "\nSecond number: " + this.terminalNumber);
    }

    private int sum(int a, int b){
        return a+b;
    }
    private int sum(int a, int b, int c){
        return a+b+c;
    }
    private int sum(int ... a){

        int result = 0;
        for(int x : a){
            result+=x;
        }
        return result;
    }

    public static void main(String[] args) {
	// write your code here
        Main m = new Main(1, 5);
        m.showNumbers();
        Main m2 = new Main(5);
        m2.showNumbers();
        Main m3 = new Main();
        m3.showNumbers();

        System.out.println(m.sum(3, 5));
        System.out.println(m.sum(3, 5, 7));
        System.out.println(m.sum(3, 5, 7, 17));
        System.out.println(m.sum(3, 5, 7, 17, 23));
    }
}
