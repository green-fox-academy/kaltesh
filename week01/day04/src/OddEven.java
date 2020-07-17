import java.sql.SQLOutput;
import java.util.SortedMap;
import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("your number plez: ");
    int inputNumber = scanner.nextInt();
    if (inputNumber % 2 == 0) {
      System.out.println("even man");
    } else {
      System.out.println("odd man");
    }
    System.out.println();


  }
}