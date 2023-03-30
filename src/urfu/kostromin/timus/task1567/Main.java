package urfu.kostromin.timus.task1567;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
    int cost = 0;
    for (int i = 0; i < text.length(); i++) {
      switch (text.charAt(i)) {
        case 'a':
        case 'd':
        case 'g':
        case 'j':
        case 'm':
        case 'p':
        case 's':
        case 'v':
        case 'y':
        case ' ':
        case '.':
        case '_':
          cost++;
          break;
        case 'b':
        case 'e':
        case 'h':
        case 'k':
        case 'n':
        case 'q':
        case 't':
        case 'w':
        case 'z':
        case ',':
          cost += 2;
          break;
        case 'c':
        case 'f':
        case 'i':
        case 'l':
        case 'o':
        case 'r':
        case 'u':
        case 'x':
        case '!':
          cost += 3;
          break;
      }
    }
    System.out.println(cost);
  }
}
