package urfu.kostromin.lr12;

import java.util.List;

public class Task6 {

  public static void main(String[] args) {

    List<Integer> numbers = List.of(5, 7, 9, 10, 15, 3, 20);
    int number = 5;

    List<Integer> resultNumbers = filterNumbers(numbers, number);
    System.out.println(resultNumbers);
  }

  public static List<Integer> filterNumbers(List<Integer> numbers, int number) {
    return numbers.stream().filter(n -> n % number == 0).toList();
  }
}
