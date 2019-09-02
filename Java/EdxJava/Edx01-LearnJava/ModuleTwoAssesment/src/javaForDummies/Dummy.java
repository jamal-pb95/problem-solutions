package javaForDummies;

public class Dummy {
    public static void main(String[] args) {
        int x = 250;
        while (x % 3 != 0) {
            System.out.println(x);
            x -= 100;
        }
    }
}
