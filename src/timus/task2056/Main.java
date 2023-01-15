package timus.task2056;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      int numberOfExams = scanner.nextInt();
      List<Integer> grades = new ArrayList<>();
      for (int i = 0; i < numberOfExams; i++) {
        grades.add(scanner.nextInt());
      }
      scanner.close();

      double avg = grades.stream().mapToDouble(a -> a).sum() / grades.size();

      if (avg == 5) {
        System.out.println("Named");
      }
      else if (grades.contains(3) || grades.contains(2)) {
        System.out.println("None");
      }
      else if (avg >= 4.5) {
        System.out.println("High");
      }
      else {
        System.out.println("Common");
      }
    }
    catch (InputMismatchException e) {
      System.out.println("Укажите число");
    }
    scanner.close();
  }
}