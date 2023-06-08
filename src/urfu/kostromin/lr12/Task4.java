package urfu.kostromin.lr12;

import java.util.List;

public class Task4 {

  public static void main(String[] args) {

    List<Integer> numbers = List.of(5, 4, 9, 10, 15, 3, 20, 13, 6);

    List<Integer> resultNumbers = filterNumbers(numbers);
    System.out.println(resultNumbers);
  }

  public static List<Integer> filterNumbers(List<Integer> numbers) {
    return numbers.stream().map(n -> n * n).toList();
  }
}
