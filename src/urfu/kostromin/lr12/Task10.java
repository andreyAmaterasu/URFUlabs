package urfu.kostromin.lr12;

import java.util.List;

public class Task10 {

  public static void main(String[] args) {

    List<Integer> numbers = List.of(5, 7, 9, 10, 15, 3, 20, 13, 11);
    int number = 10;

    List<Integer> resultNumbers = filterNumbers(numbers, number);
    System.out.println(resultNumbers);
  }

  public static List<Integer> filterNumbers(List<Integer> numbers, int number) {
    return numbers.stream().filter(n -> n < number).toList();
  }
}
