import java.sql.SQLOutput;
import java.util.SortedMap;
import java.util.Scanner;


public class PrintBigger {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("numbers plez:");
    int input01 = scanner.nextInt();
    int input02 = scanner.nextInt();
    if (input01 > input02) {
      System.out.println("bigger number is: " + input01);
    } else {
      System.out.println("bigger number is: " + input02);
    }


  }
}