package urfu.kostromin.lr9;

public class Example7 {

  public static void main(String[] args) {
    try {
      System.out.println("0");
      throw new NullPointerException("Ошибка");
    } catch (NullPointerException e) {
      try { // FIX: Обернуть блок, где выбрасывается исключение типа ArithmeticException в конструкцию try/catch
        System.out.println("1");
        throw new ArithmeticException();
      } catch (ArithmeticException e2) {
        System.out.println("1.5");
      }
    } catch (ArithmeticException e) {
      System.out.println("2");
    }
    System.out.println("3");
  }
}
