package exercise01;

import java.util.Arrays;
import java.util.List;

public class Main {

  //  Write a Stream Expression to get the even numbers from the following list:
  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    numbers.stream()
        .filter(number -> number % 2 == 0)
        .forEach(System.out::println);
  }
}
// solving it with good old for loop
//  for (int i = 0; i < myList.size(); i++) {
//    if (myList.get(i) > 3) {
//    System.out.println(myList.get(i));
//    }
//    }
//
//     solving it with magic
//    myList.stream().filter(x -> x > 3).forEach(System.out::println)