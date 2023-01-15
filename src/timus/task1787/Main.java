package timus.task1787;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] kn = scanner.nextLine().split(" ");
    int k = Integer.parseInt(kn[0]);
    int n = Integer.parseInt(kn[1]);
    String[] a = scanner.nextLine().split(" ");
    int carsCount = 0;
    for (int i = 0; i < a.length; i++) {
      carsCount += Integer.parseInt(a[i]);
      carsCount = carsCount >= k ? carsCount - k : 0;
    }
    System.out.println(carsCount);
  }
}
