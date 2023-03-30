package urfu.kostromin.lr9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {

  public static void main(String[] args) {
    try {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Укажите размер массива: ");
      int size = scanner.nextInt();
      scanner.nextLine();

      byte[] arr = new byte[size];
      for (int i = 0; i < size; i++) {
        System.out.print("Укажите значение для элемента №" + (i + 1) + ": ");
        arr[i] = scanner.nextByte();
      }

      int sum = 0;
      for (byte b : arr) {
        sum += b;
      }
      System.out.println("Сумма элементов массива = " + sum);
    } catch (InputMismatchException e) {
      System.out.println("Произошел ввод строки вместо числа или выход за границы диапазона типа byte");
    }
  }
}
