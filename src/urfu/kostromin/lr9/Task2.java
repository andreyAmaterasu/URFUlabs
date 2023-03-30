package urfu.kostromin.lr9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {

  public static void main(String[] args) {
    try {
      int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

      System.out.print("Укажите номер столбца: ");
      Scanner scanner = new Scanner(System.in);
      int columnNum = scanner.nextInt();
      scanner.nextLine();

      for (int i = 0; i < matrix.length; i++) {
        System.out.println(matrix[i][columnNum - 1] + " ");
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Выход за пределы массива, столбец с указанным номер отсутствует");
    } catch (InputMismatchException e) {
      System.out.println("Произошел ввод строки вместо числа");
    }
  }
}
