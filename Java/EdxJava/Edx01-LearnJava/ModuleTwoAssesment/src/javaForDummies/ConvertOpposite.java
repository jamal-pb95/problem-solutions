package javaForDummies;

import java.util.Scanner;

public class ConvertOpposite {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String word = keyboard.next();
        StringBuffer str = new StringBuffer(word);
        System.out.println(reverseCase(str));
    }

    public static String reverseCase(StringBuffer text) {
        int len = text.length();
        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            if (Character.isUpperCase(c)) {
                text.replace(i, i+1, Character.toLowerCase(c)+"");
            } else if (Character.isLowerCase(c)) {
                text.replace(i, i+1, Character.toUpperCase(c)+"");
            }
        }
        return new String(text);
    }
}