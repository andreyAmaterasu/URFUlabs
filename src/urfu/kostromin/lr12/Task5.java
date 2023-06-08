package urfu.kostromin.lr12;

import java.util.List;

public class Task5 {

  public static void main(String[] args) {

    List<String> strings = List.of("Строка", "Тест", "Не строка", "Страница", "Сорока");
    String substring = "стр";

    List<String> resultStrings = filterStrings(strings, substring);
    System.out.println(resultStrings);
  }

  public static List<String> filterStrings(List<String> strings, String substring) {
    return strings.stream().filter(s -> s.toLowerCase().contains(substring)).toList();
  }
}
