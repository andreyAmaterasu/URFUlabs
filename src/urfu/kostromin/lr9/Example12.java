package urfu.kostromin.lr9;

public class Example12 {

  public static void main(String[] args) {
    try { // FIX: необходимо перехватить исключение типа IllegalArgumentException и обработать его
      System.out.println("0");
      m(null, 0.000001);
    } catch (IllegalArgumentException e) {
      System.out.println("1");
    }
  }

  public static void m(String str, double chislo) {
    if (str == null) {
      throw new IllegalArgumentException("Строка введена неверно");
    }
    if (chislo > 0.001) {
      throw new IllegalArgumentException("Неверное число");
    }
  }
}
