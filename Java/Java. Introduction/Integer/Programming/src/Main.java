import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    System.out.println(((n + 1) * n + 2) * n + 3);
  }
}