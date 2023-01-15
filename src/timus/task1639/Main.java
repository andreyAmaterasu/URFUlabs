package timus.task1639;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] mn = scanner.nextLine().split(" ");
    int m = Integer.parseInt(mn[0]);
    int n = Integer.parseInt(mn[1]);
    if (m * n % 2 == 0) {
      System.out.println("[:=[first]");
    } else {
      System.out.println("[second]=:]");
    }
  }
}
