import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class WriteAFile {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("mytext.txt");
            PrintStream myOutput = new PrintStream(fout);
            myOutput.println("Wow! I write mytext file using Java.");
            myOutput.println("Hello TextFile!");
            System.out.println("Data write sucssful");
        } catch (IOException e) {
            System.out.println(e);
            System.exit(1);
        }
    }
}
