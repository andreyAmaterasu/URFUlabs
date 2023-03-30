package urfu.kostromin.timus.task1409;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] ab = scanner.nextLine().split(" ");
    int a = Integer.parseInt(ab[0]);
    int b = Integer.parseInt(ab[1]);
    int sum = a + b - 1;
    System.out.println((sum - a) + " " + (sum - b));
  }
}
