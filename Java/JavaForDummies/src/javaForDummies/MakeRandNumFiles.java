package javaForDummies;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;

public class MakeRandNumFiles {
    public static void main(String[] args) throws IOException {
        Random generator = new Random();
        if (args.length < 2) {
            System.out.println("Usage: MakeRandNumFiles filename number");
            System.exit(1);
        }

        PrintStream printStream = new PrintStream(args[0]);
        int numLines = Integer.parseInt(args[1]);
        for (int count = 0; count < numLines; count++) {
            printStream.println(generator.nextInt(10) + 1);
        }
        printStream.close();
    }
}
