package urfu.kostromin.timus.task1636;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] t = scanner.nextLine().split(" ");
    int t1 = Integer.parseInt(t[0]);
    int t2 = Integer.parseInt(t[1]);
    String[] penalty = scanner.nextLine().split(" ");
    int penaltyZZZ = Arrays.stream(penalty).mapToInt(Integer::parseInt).sum() * 20;
    if (t2 - penaltyZZZ >= t1) {
      System.out.println("No chance.");
    } else {
      System.out.println("Dirty debug :(");
    }
  }
}
