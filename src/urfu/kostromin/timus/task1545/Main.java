package urfu.kostromin.timus.task1545;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    scanner.nextLine();
    List<String> sym = new ArrayList<>();
    for (int i = 0; i < num; i++) {
      sym.add(scanner.nextLine());
    }
    String inputChar = scanner.nextLine();
    for (String s : sym) {
      if (s.startsWith(inputChar)) {
        System.out.println(s);
      }
    }
  }
}
