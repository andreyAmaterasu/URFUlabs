package urfu.kostromin.lr9;

public class Example2 {

  public static void main(String[] args) {
    try {
      System.out.println("0");
      throw new RuntimeException("Непроверяемая ошибка");
//      System.out.println("1"); FIX: Ошибка компиляции, закомментируем строку для исправления
    } catch (Exception e) {
      System.out.println("2 " + e);
    }
    System.out.println("3");
  }
}
