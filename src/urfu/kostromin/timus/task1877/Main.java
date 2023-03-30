package urfu.kostromin.timus.task1877;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int firstCode = scanner.nextInt();
    int secondCode = scanner.nextInt();
    if ((firstCode % 2 == 0 && secondCode % 2 == 0) ||
        (firstCode % 2 > 0 && secondCode % 2 > 0) ||
        (firstCode % 2 == 0 && secondCode % 2 > 0)) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }
  }
}
