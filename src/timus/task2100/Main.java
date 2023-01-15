package timus.task2100;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberOfFriends = scanner.nextInt();
    scanner.nextLine();
    int cost = 200;
    while (numberOfFriends > 0) {
      String friend = scanner.nextLine();
      cost += friend.contains("+one") ? 200 : 100;
      numberOfFriends--;
    }
    cost += cost == 1300 ? 100 : 0;
    System.out.println(cost);
    scanner.close();
  }
}
