package timus.task1785;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    if (num <= 4) {
      System.out.println("few");
    } else if (num <= 9) {
      System.out.println("several");
    } else if (num <= 19) {
      System.out.println("pack");
    } else if (num <= 49) {
      System.out.println("lots");
    } else if (num <= 99) {
      System.out.println("horde");
    } else if (num <= 249) {
      System.out.println("throng");
    } else if (num <= 499) {
      System.out.println("swarm");
    } else if (num <= 999) {
      System.out.println("zounds");
    } else {
      System.out.println("legion");
    }
  }
}
