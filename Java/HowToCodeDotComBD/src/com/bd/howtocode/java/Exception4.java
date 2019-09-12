package com.bd.howtocode.java;

public class Exception4 {
    public static void main(String[] args) {
        String[] strings = {"1", "2", "3", "four", "5", "6", "7", "8", "9"};
        System.out.println(getSum(strings));
    }

    public static int getSum(String[] strings) {
        int result = 0;

        try {
            for (String string : strings) {
                result += (Integer.valueOf(string));
            }
        } catch (NumberFormatException e) {
            System.err.println(e);
        }

        return result;
    }
}