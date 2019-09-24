package javaForDummies;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ShowNames {
    public static void main(String[] args) throws IOException {
        ArrayList<String> people = new ArrayList<>();
        Scanner sc = new Scanner(new File("F:\\Projects\\problem-solving\\Java\\JavaForDummies\\src\\javaForDummies\\names.txt"));
        while (sc.hasNext()){
            people.add(sc.nextLine());
        }

        people.remove(0);
        people.add(2, "Jim Newton");

        for (String name : people) {
            System.out.println(name);
        }

        sc.close();
    }
}
