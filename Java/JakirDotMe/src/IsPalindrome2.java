import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IsPalindrome2 {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String str = new String();
        str = rd.readLine();
        System.out.println(palindromeChecker(str));
    }

    public static String palindromeChecker(String word) {
        word = word.toLowerCase();
        String reverseWord = new StringBuffer(word).reverse().toString();
        return word.equals(reverseWord) ? word + " is a palindrome" : word + " is not a palindrome";
    }
}
