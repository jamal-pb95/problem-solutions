package javaForDummies;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ShowGuests {
    public static void main(String[] args) throws IOException {
        int guests[] = new int[10];
        Scanner sc = new Scanner(new File("F:\\Projects\\problem-solving\\Java\\JavaForDummies\\workspaceJavaFD_5_IDEA\\11-01\\GuestList.txt"));

        for (int roomNum = 0; roomNum < 10; roomNum++) {
            guests[roomNum] = sc.nextInt();
        }

        System.out.println("Room\tGuests");

        for (int roomNum = 0; roomNum < 10; roomNum++) {
            System.out.print(roomNum);
            System.out.print("\t");
            System.out.println(guests[roomNum]);
        }

        sc.close();
    }
}
