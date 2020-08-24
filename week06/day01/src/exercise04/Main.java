

package exercise04;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    OptionalDouble avg = numbers.stream()
//      .filter(number -> number % 2 == 1 || number % 2 == -1)
        .filter(number -> number % 2 != 0)
        .mapToInt(Integer::intValue)

        .average();
    System.out.println(avg);
  }
}
//Exercise 4
//    Write a Stream Expression to get the average value of the odd numbers from the following list:
//,