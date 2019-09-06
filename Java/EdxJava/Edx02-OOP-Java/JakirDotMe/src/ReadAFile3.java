import java.io.FileReader;

public class ReadAFile3 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("F:\\Projects\\problem-solving\\Java\\EdxJava\\Edx02-OOP-Java\\JakirDotMe\\mytext.txt");
        int i;
        String str = "";
        while ((i = fr.read()) != -1) {
            str += (char)i;
        }
        System.out.println(str);
    }
}
