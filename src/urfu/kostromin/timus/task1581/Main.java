package urfu.kostromin.timus.task1581;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    scanner.nextLine();
    int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int prev = nums[0];
    int count = 0;
    for (int i = 0; i < number; i++) {
      if (nums[i] == prev) {
        count++;
      }
      else {
        if (count == 0) {
          System.out.print(1 + " " + prev + " ");
        } else {
          System.out.print(count + " " + prev + " ");
        }
        count = 1;
      }
      if (i == nums.length - 1) {
        System.out.print(count + " " + nums[i] + " ");
      }
      prev = nums[i];
    }
  }
}
