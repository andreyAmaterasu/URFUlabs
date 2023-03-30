package urfu.kostromin.timus.task1293;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] nab = scanner.nextLine().split(" ");
    int n = Integer.parseInt(nab[0]);
    int a = Integer.parseInt(nab[1]);
    int b = Integer.parseInt(nab[2]);
    System.out.println(a * b * n * 2);
  }
}
