import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exercise08 {
  public static void main(String[] args) {

    List<Character> charsToConcat = new ArrayList<>();
    charsToConcat.add('a');
    charsToConcat.add('n');
    charsToConcat.add('y');
    charsToConcat.add('a');
    charsToConcat.add('d');

    String anyad = charsToConcat.stream()
        .map(String::valueOf)
        .collect(Collectors.joining());
    System.out.println(anyad);
  }
}

//    Write a Stream Expression to concatenate a Character list to a string!