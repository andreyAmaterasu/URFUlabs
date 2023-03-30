package urfu.kostromin.timus.task1880;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int first = scanner.nextInt();
    scanner.nextLine();
    List<Integer> firstNumbers = Arrays.stream(scanner.nextLine().split(" "))
        .map(Integer::parseInt)
        .collect(Collectors.toList());
    int second = scanner.nextInt();
    scanner.nextLine();
    List<Integer> secondNumbers = Arrays.stream(scanner.nextLine().split(" "))
        .map(Integer::parseInt)
        .collect(Collectors.toList());
    int third = scanner.nextInt();
    scanner.nextLine();
    List<Integer> thirdNumbers = Arrays.stream(scanner.nextLine().split(" "))
        .map(Integer::parseInt)
        .collect(Collectors.toList());
    firstNumbers.retainAll(secondNumbers);
    firstNumbers.retainAll(thirdNumbers);
    System.out.println(firstNumbers.size());
  }
}
