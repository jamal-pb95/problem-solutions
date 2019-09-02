package javaForDummies;

public class StringExp {
    public static void main(String[] args) {
        String str1 = "Frodo Banggis";
        String str2 = "Gandlaf the GRAY";

        System.out.println("Length of str1: " + str1.length());
        System.out.println("char at 7 in str1: " + str1.charAt(7));
        System.out.println("char at 0 in str2: " + str2.charAt(0));
        System.out.println("index of 'o' in str1: " + str1.indexOf("o"));
        System.out.println("uppercase of str2: " + str2.toUpperCase());
        System.out.println("lowercase index of 'B' in str1: " + str1.toLowerCase().indexOf("B"));
        System.out.println("str1 substring 4: " + str1.substring(4));
        System.out.println("str2.substring(3, 14): " + str2.substring(3, 14));
        System.out.println("str2.replace(\"a\", \"oo\"): " + str2.replace("a", "oo"));
        System.out.println("str2.replace(\"gray\", \"white\"): " + str2.replace("gray", "white"));
        System.out.println("\"str1\".replace(\"r\", \"range\"): " + "str1".replace("r", "range"));
    }
}
