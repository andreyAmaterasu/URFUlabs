package urfu.kostromin.timus.task1313;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.nextLine();
    int[][] arr = new int[n][n];
    for(int i = 0; i < n; i++){
      int[] arr2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      arr[i] = arr2;
    }
    for(int i = 0; i < n; i++) {
      int j = i;
      int k = 0;
      while (j >= 0) {
        System.out.print(arr[j][k] + " ");
        j--;
        k++;
      }
    }
    int col = 1;
    while (col < arr.length) {
      int row = arr.length - 1;
      int dep = col;
      while (dep < arr.length) {
        System.out.print(arr[row][dep] + " ");
        row--;
        dep++;
      }
      col++;
    }
  }
}
