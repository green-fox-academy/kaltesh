import java.sql.SQLOutput;
import java.util.SortedMap;
import java.util.Scanner;


public class HelloUser {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("type name plez:");
    String userInput1 = scanner.nextLine();
    System.out.println("hi, my name is: " + userInput1);


  }
}