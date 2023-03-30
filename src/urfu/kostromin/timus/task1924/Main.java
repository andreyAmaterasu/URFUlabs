package urfu.kostromin.timus.task1924;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int result = 1;
    for (int i = 1; i < n; i++) {
      if (i % 2 != 0) {
        result += (i + 1);
      } else {
        result -= (i + 1);
      }
    }
    String color = result % 2 == 0 ? "black" : "grimy";
    System.out.println(color);
  }
}
