package javaForDummies;

import java.util.Scanner;

public class Crypto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter normal string: ");
        String normalStr = sc.nextLine();

        System.out.println(caesarCipher(normalizeText(normalStr), 4));
    }

    public static String normalizeText(String str) {
        return String.join("", str.split("[, .:;'\"!?()]+")).toUpperCase();
    }

    public static StringBuffer caesarCipher(String str, int key) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if ((int)str.charAt(i) < 65 && (int)str.charAt(i) > 90 && (int)str.charAt(i) < 97 && (int)str.charAt(i) > 122) {
                char ch = str.charAt(i);
                result.append(ch);
            } else if (Character.isUpperCase(str.charAt(i))) {
                char ch = (char)(((int)str.charAt(i) + key - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char)(((int) str.charAt(i) + key - 97) % 26 + 97);
                result.append(ch);
            }
        }

        return result;
    }
}
