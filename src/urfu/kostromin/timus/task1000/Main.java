package urfu.kostromin.timus.task1000;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sum = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).sum();
    System.out.println(sum);
  }
}
