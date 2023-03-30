package urfu.kostromin.timus.task1496;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<String> accounts = new ArrayList<>();
    int n = scanner.nextInt();
    scanner.nextLine();
    while (n > 0) {
      accounts.add(scanner.nextLine());
      n--;
    }
    HashSet<String> hashSetAccount = new HashSet<>();
    for (String account : accounts) {
      if (Collections.frequency(accounts, account) > 1) {
        hashSetAccount.add(account);
      }
    }
    for (String account : hashSetAccount) {
      System.out.println(account);
    }
  }
}
