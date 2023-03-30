package urfu.kostromin.timus.task1263;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] nm = scanner.nextLine().split(" ");
    int n = Integer.parseInt(nm[0]);
    int m = Integer.parseInt(nm[1]);
    List<Double> mi = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      mi.add(0.0);
    }
    for (int i = 0; i < m; i++) {
      int index = scanner.nextInt() - 1;
      mi.set(index, mi.get(index) + 1);
    }
    for (Double x : mi) {
      System.out.printf("%.2f%s\n", (x * 100) / m, "%");
    }
  }
}
