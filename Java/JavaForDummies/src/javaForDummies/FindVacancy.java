package javaForDummies;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class FindVacancy {
    public static void main(String[] args) throws FileNotFoundException {
        int guests[] = new int[10];
        int roomNum;

        Scanner sc = new Scanner(new File("F:\\Projects\\problem-solving\\Java\\JavaForDummies\\workspaceJavaFD_5_IDEA\\11-01\\GuestList.txt"));

        for (roomNum = 0; roomNum < 10; roomNum++) {
            guests[roomNum] = sc.nextInt();
        }

        sc.close();

        roomNum = 0;
        while (roomNum < 10 && guests[roomNum] != 0) {
            roomNum++;
        }

        if (roomNum == 10) {
            System.out.println("Sorry!, We've no vacancy!");
        } else {
            System.out.print("How many people for room? ");
            System.out.print(roomNum);
            System.out.print("? ");

            Scanner kb = new Scanner(System.in);
            guests[roomNum] = kb.nextInt();
            kb.close();

            PrintStream listOut = new PrintStream("F:\\Projects\\problem-solving\\Java\\JavaForDummies\\workspaceJavaFD_5_IDEA\\11-01\\GuestList.txt");
            for (roomNum = 0; roomNum < 10; roomNum++) {
                listOut.print(guests[roomNum]);
                listOut.print(" ");
            }
            listOut.close();
        }
    }
}
