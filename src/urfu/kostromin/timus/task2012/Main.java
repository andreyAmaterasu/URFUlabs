package urfu.kostromin.timus.task2012;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int f = scanner.nextInt();
    String res = f >= 12 - 5 ? "YES" : "NO";
    System.out.println(res);
  }
}
