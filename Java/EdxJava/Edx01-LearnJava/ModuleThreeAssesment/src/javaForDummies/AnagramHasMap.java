package javaForDummies;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramHasMap {
    public static String areAnagram(String str1, String str2) {
        HashMap<Character, Integer> hmap1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hmap2 = new HashMap<Character, Integer>();

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        // Mapping first string
        for (int i = 0; i < arr1.length; i++) {
            if (hmap1.get(arr1[i]) == null) {
                hmap1.put(arr1[i], 1);
            } else {
                Integer c = (int)hmap1.get(arr1[i]);
                hmap1.put(arr1[i], ++c);
            }
        }

        // Mapping second string
        for (int i = 0; i < arr2.length; i++) {
            if (hmap2.get(arr2[i]) == null) {
                hmap2.put(arr2[i], 1);
            } else {
                Integer c = (int)hmap2.get(arr2[i]);
                hmap2.put(arr2[i], ++c);
            }
        }

        return hmap1.toString().toLowerCase().equals(hmap2.toString().toLowerCase()) ? "Anagrams" : "Not Anagrams";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(areAnagram(str1, str2));
    }
}
