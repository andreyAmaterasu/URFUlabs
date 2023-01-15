package timus.task1820;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] nk = scanner.nextLine().split(" ");
    double n = Double.parseDouble(nk[0]);
    double k = Double.parseDouble(nk[1]);
    int result;
    if (k >= n) {
      result = 2;
    } else {
      result = (int) (n * 2 / k + (n * 2 % k == 0 ? 0 : 1));
    }
    System.out.println(result);
  }
}
