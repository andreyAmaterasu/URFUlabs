package urfu.kostromin.lr12;

import java.util.Arrays;

public class Task1 {

  public static void main(String[] args) {

    int[] numbers = new int[] { 5, 4, 9, 10, 15, 3, 20, 13, 6 };

    int[] resultNumbers = filterNumbers(numbers);
    System.out.println(Arrays.toString(resultNumbers));
  }

  public static int[] filterNumbers(int[] numbers) {
    return Arrays.stream(numbers).filter(n -> n % 2 == 0).toArray();
  }
}
