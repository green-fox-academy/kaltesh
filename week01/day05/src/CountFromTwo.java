import java.sql.SQLOutput;
import java.util.SortedMap;
import java.util.Scanner;


public class CountFromTwo {
  public static void main(String[] args) {

// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one

    Scanner scanner = new Scanner(System.in);
    System.out.println("2 numbers plez");
    int inputNumber01 = scanner.nextInt();
    int inputNumber02 = scanner.nextInt();
    if ((inputNumber01) >= (inputNumber02)) {
      System.out.println("The second number should be bigger");
    } else {
      for (int i = inputNumber01; i < inputNumber02; i++) {
        System.out.println(i);
      }
    }





  }
}