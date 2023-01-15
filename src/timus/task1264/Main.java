package timus.task1264;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String result = scanner.nextLine();
    int n = Integer.parseInt(result.split(" ")[0]);
    int m = Integer.parseInt(result.split(" ")[1]);
    System.out.println(n * (m + 1));
  }
}
