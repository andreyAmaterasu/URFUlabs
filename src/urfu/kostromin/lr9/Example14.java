package urfu.kostromin.lr9;

public class Example14 {

  public static void main(String[] args) {
    try {
      int l = args.length;
      System.out.println("Размер массива = " + l);
      m(l);
    } catch (ArithmeticException e) {
      System.out.println("Ошибка: деление на ноль");
    }
  }

  public static void m(int x) throws ArithmeticException {
    int h = 10 / x;
  }
}
