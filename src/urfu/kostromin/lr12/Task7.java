package urfu.kostromin.lr12;

import java.util.List;

public class Task7 {

  public static void main(String[] args) {

    List<String> strings = List.of("Жираф", "Лошадь", "Собака", "Кот", "Мышь", "Змея");
    int stringLength = 4;

    List<String> resultStrings = filterStrings(strings, stringLength);
    System.out.println(resultStrings);
  }

  public static List<String> filterStrings(List<String> strings, int stringLength) {
    return strings.stream().filter(s -> s.length() > stringLength).toList();
  }
}
