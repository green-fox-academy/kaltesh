import java.lang.reflect.Array;

public class Sum {
  public static void main(String[] args) {
    // Create the usual class wrapper and main method on your own.
// Write a function called `sum` that returns the sum of numbers from zero to the given parameter

    System.out.println(sum(2));

  }

  public static int sum(int number) {
    if (number == 0) {
      return 0;
    }
    return number + sum(number - 1);
  }
//    why this no good
//  public static int sum(int number) {
//    return number + sum(number - 1);
//  }

}
