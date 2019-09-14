import java.io.File;
import java.util.Scanner;

public class ReadAFileWScanner {
    public static void main(String[] args) throws Exception {
        File file = new File("F:\\Projects\\problem-solving\\Java\\EdxJava\\Edx02-OOP-Java\\JakirDotMe\\mytext.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}
