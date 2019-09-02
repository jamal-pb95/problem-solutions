package javaForDummies;

import java.util.Scanner;

public class ChangeCase {
    public static void main (String args[]) {
        Scanner keyboard = new Scanner(System.in);
        String sentence = keyboard.nextLine();
        System.out.println(changeCase(sentence));
    }

    public static String changeCase(String str) {
        int len = str.length();
        String newStr = "";

        for (int i = 0; i < len; i++) {
            int ch = str.charAt(i);

            if (ch > 64 && ch < 91) {
                ch = ch + 32;
                newStr += (char) ch;
            } else if (ch > 96 && ch < 123) {
                ch = ch - 32;
                newStr += (char) ch;
            }

            if (ch == 32){
                newStr += " ";
            }
        }
        return newStr;
    }
}
