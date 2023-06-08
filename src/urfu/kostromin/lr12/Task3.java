package urfu.kostromin.lr12;

import java.util.List;

public class Task3 {

  public static void main(String[] args) {

    List<String> strings = List.of("строка", "Тест", "не строка", "страница", "Сорока");

    List<String> resultStrings = filterStrings(strings);
    System.out.println(resultStrings);
  }

  public static List<String> filterStrings(List<String> strings) {
    return strings.stream().filter(s -> Character.isUpperCase(s.charAt(0))).toList();
  }
}
