package urfu.kostromin.timus.task1935;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.nextLine();
    int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    System.out.println(Arrays.stream(a).sum() + Arrays.stream(a).max().orElse(0));
  }
}
