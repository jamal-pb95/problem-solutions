package javaForDummies;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ShowRooms {
    public static void main(String[] args) throws IOException {
        Room rooms[];
        rooms = new Room[10];

        Scanner sc = new Scanner(new File("F:\\Projects\\problem-solving\\Java\\JavaForDummies\\workspaceJavaFD_5_IDEA\\11-05\\RoomList.txt"));
        for (int roomNum = 0; roomNum < 10; roomNum++) {
            rooms[roomNum] = new Room();
            rooms[roomNum].readRoom(sc);
        }

        System.out.println("Room\tGuests\tRate\tSmoking");
        for (int roomNum = 0; roomNum < 10; roomNum++) {
            System.out.print(roomNum);
            System.out.print("\t");
            rooms[roomNum].writeRoom();
        }
        sc.close();
    }
}
