import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadTextAsString {
    public static void main(String[] args) throws Exception {
        String data = readFileAsString("F:\\Projects\\problem-solving\\Java\\EdxJava\\Edx02-OOP-Java\\JakirDotMe\\mytext.txt");
        System.out.println(data);
    }

    public static String readFileAsString(String fileName) throws Exception {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }
}
