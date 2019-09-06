import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(palindromeChecker(word));
    }

    public static String palindromeChecker(String word) {
        word = word.toLowerCase();
        String reverseWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord += String.valueOf(word.charAt(i));
        }
        return word.equals(reverseWord) ? word + " is a palindrome" : word + " is not a palindrome";
    }
}
