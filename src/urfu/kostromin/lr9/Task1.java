package urfu.kostromin.lr9;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

  public static void main(String[] args) {
    try {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Укажите размер массива: ");
      int size = scanner.nextInt();
      scanner.nextLine();

      int[] arr = new int[size];
      for (int i = 0; i < size; i++) {
        System.out.print("Укажите значение для элемента №" + (i + 1) + ": ");
        int inputNum = scanner.nextInt();
        if (inputNum < 0) {
          throw new NumberFormatException();
        }
        arr[i] = inputNum;
        scanner.nextLine();
      }
      double res = ((double) Arrays.stream(arr).sum()) / size;
      System.out.printf("Среднее значение = %.2f", res);
    } catch (InputMismatchException e) {
      System.out.println("Произошел ввод строки вместо числа или указанное значение не соответствует типу int");
    } catch (NumberFormatException e) {
      System.out.println("Указанное значение меньше нуля");
    }
  }
}
