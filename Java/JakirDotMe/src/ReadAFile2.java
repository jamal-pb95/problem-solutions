import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadAFile2 {
    public static void main(String[] args) throws Exception {
        File file = new File("F:\\Projects\\problem-solving\\Java\\EdxJava\\Edx02-OOP-Java\\JakirDotMe\\mytext.txt");
        BufferedReader rd = new BufferedReader(new FileReader(file));
        String str;
        while ((str = rd.readLine()) != null) {
            System.out.println(str);
        }
    }
}
