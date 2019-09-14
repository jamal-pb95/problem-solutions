import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadAFile {
    public static void main(String[] args) {
        try {
            FileInputStream fstream = new FileInputStream("myText.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
            String strLine = rd.readLine();
            in.close();

            System.out.println(strLine);
        } catch (Exception e) {
            System.out.println("error");
            System.exit(1);
        }
    }
}
