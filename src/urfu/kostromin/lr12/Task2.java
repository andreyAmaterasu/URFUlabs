package urfu.kostromin.lr12;

import java.util.Arrays;

public class Task2 {

  public static void main(String[] args) {

    int[] numbers1 = new int[] { 5, 4, 9, 10, 15, 3, 20, 13, 6 };
    int[] numbers2 = new int[] { 11, 8, 4, 14, 3, 30, 71, 19 };

    int[] resultNumbers = filterNumbers(numbers1, numbers2);
    System.out.println(Arrays.toString(resultNumbers));
  }

  public static int[] filterNumbers(int[] numbers1, int[] numbers2) {
    return Arrays.stream(numbers1).filter(n1 -> Arrays.stream(numbers2).anyMatch(n2 -> n1 == n2)).toArray();
  }
}
