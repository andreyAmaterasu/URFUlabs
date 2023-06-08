package urfu.kostromin.lr12;

import java.util.List;

public class Task9 {

  public static void main(String[] args) {

    List<String> strings = List.of("Жираф1", "Лошадь!", "Собака", "Кот", "(Мышь)", "Змея...");

    List<String> resultStrings = filterStrings(strings);
    System.out.println(resultStrings);
  }

  public static List<String> filterStrings(List<String> strings) {
    return strings.stream().filter(s -> s.chars().allMatch(Character::isLetter)).toList();
  }
}
