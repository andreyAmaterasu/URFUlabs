package urfu.kostromin.timus.task1585;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.nextLine();
    int emperorPenguinCount = 0;
    int littlePenguinCount = 0;
    int macaroniPenguinCount = 0;
    for (int i = 0; i < n; i++) {
      String penguin = scanner.nextLine();
      switch (penguin){
        case "Emperor Penguin":
          emperorPenguinCount++;
          break;
        case "Little Penguin":
          littlePenguinCount++;
          break;
        case "Macaroni Penguin":
          macaroniPenguinCount++;
          break;
      }
    }
    String result = emperorPenguinCount > littlePenguinCount ? "Emperor Penguin" :
        macaroniPenguinCount > littlePenguinCount ? "Macaroni Penguin" : "Little Penguin";
    System.out.println(result);
  }
}
