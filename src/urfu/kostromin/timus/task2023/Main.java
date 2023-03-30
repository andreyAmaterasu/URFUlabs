package urfu.kostromin.timus.task2023;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.nextLine();
    String[][] names = {{"Alice", "Ariel", "Aurora", "Phil", "Peter", "Olaf", "Phoebus", "Ralph", "Robin"},
        {"Bambi", "Belle", "Bolt", "Mulan", "Mowgli", "Mickey", "Silver", "Simba", "Stitch"},
        {"Dumbo", "Genie", "Jiminy", "Kuzko", "Kida", "Kenai", "Tarzan", "Tiana", "Winnie"}};
    int position = 0;
    int steps = 0;
    for (int i = 0; i < n; i++) {
      String name = scanner.nextLine();
      for (int j = 0; j < names.length; j++) {
        if (Arrays.asList(names[j]).contains(name)) {
          steps += Math.abs(j - position);
          position = j;
        }
      }
    }
    System.out.println(steps);
  }
}
