import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        al.add("F");
        al.add("G");
        al.add("H");

        System.out.println("Size of array list: " + al.size());
        System.out.println("Contents of array list: " + al);
    }
}
