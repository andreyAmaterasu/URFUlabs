package urfu.kostromin.timus.task1068;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int result = 0;
    while (num != 1) {
      result += num;
      if (num < 1) {
        num++;
      } else {
        num--;
      }
    }
    System.out.println(result + 1);
  }
}
