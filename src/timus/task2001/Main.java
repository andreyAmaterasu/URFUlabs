package timus.task2001;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    List<String> allWeight = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    while (allWeight.size() < 3) {
      String weight = scanner.nextLine();
      allWeight.add(weight);
    }

    int firstBasketWeight = Integer.parseInt(allWeight.get(2).split(" ")[0]);
    int secondBasketWeight = Integer.parseInt(allWeight.get(1).split(" ")[1]);
    int firstBerriesWeight = Integer.parseInt(allWeight.get(0).split(" ")[0]) - firstBasketWeight;
    int secondBerriesWeight = Integer.parseInt(allWeight.get(0).split(" ")[1]) - secondBasketWeight;
    System.out.println(firstBerriesWeight + " " + secondBerriesWeight);

    scanner.close();
  }
}
