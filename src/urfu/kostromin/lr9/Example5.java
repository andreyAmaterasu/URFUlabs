package urfu.kostromin.lr9;

public class Example5 {

  public static void main(String[] args) {
    try {
      System.out.println("0");
      throw new RuntimeException("Ошибка");
    } catch (NullPointerException e) {
      System.out.println("1");
    } catch (RuntimeException e) { // FIX: Добавляем класс RuntimeException для перехвата исключения
      System.out.println("2");
    }
    System.out.println("3");
  }
}
