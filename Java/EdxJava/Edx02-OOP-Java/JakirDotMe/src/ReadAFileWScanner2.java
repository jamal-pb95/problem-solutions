import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadAFileWScanner2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("F:\\Projects\\problem-solving\\Java\\EdxJava\\Edx02-OOP-Java\\JakirDotMe\\mytext.txt");
        Scanner sc = new Scanner(file);

        sc.useDelimiter("\\Z");
        System.out.println(sc.next());
    }
}
