package com.bd.howtocode.java;

public class StringExample {
    public static void main(String[] args) {
        String str = new String("Hello World!");
        System.out.println(str);
        char[] name = {'J', 'A', 'M', 'A', 'L'};
        String nameStr = new String(name);
        System.out.println(nameStr);
        String str1 = "Bangladesh";
        String bangla = str1.substring(0, 5);
        System.out.println(bangla);
        System.out.println(bangla.toUpperCase());
        System.out.println(bangla.toLowerCase());
        System.out.println(bangla.indexOf("a"));
    }
}
