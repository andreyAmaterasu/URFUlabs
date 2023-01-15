package timus.task1563;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.nextLine();
    List<String> shops = new ArrayList<>();
    int count = 0;
    for (int i = 0; i < n; i++) {
      String shop = scanner.nextLine();
      if (shops.contains(shop)) {
        count++;
        continue;
      }
      shops.add(shop);
    }
    System.out.println(count);
  }
}
