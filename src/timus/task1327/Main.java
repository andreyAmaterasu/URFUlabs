package timus.task1327;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    if (a % 2 == 0 && b % 2 == 0) {
      System.out.println((b - a) / 2);
    } else {
      System.out.println((b - a) / 2 + 1);
    }
  }
}
