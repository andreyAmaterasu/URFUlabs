package urfu.kostromin.timus.task1349;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    if (n == 0 || n > 2) {
      System.out.println(-1);
    } else if (n == 1) {
      System.out.println("1 2 3");
    } else {
      System.out.println("3 4 5");
    }
  }
}
