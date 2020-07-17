import java.sql.SQLOutput;
import java.util.SortedMap;
import java.util.Scanner;


public class AverageOfInput {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("name your numbers: ");
    int input01 = scanner.nextInt();
    int input02 = scanner.nextInt();
    int input03 = scanner.nextInt();
    int input04 = scanner.nextInt();
    int input05 = scanner.nextInt();
    System.out.println("the sum is: " + (input01 + input02 + input03 + input04 + input05));
    System.out.println("the avg is: " + (input01 + input02 + input03 + input04 + input05) / 5);


  }
}