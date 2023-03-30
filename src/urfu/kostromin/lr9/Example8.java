package urfu.kostromin.lr9;

public class Example8 {

  public static void main(String[] args) {
    m(); // FIX: Убираем sout, т.к. функция void
  }

  public static void m() { // FIX: Убираем тип возвращаемого значение на void
    try {
      System.out.println("0");
      throw new RuntimeException();
    } catch (RuntimeException e) { // FIX: Добавляем класс RuntimeException для перехвата исключения
      System.out.println("0.5");
    } finally {
      System.out.println("1");
    }
  }
}
