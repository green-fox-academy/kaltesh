import java.sql.SQLOutput;
import java.util.SortedMap;
import java.util.Scanner;


public class MultiplicationTable {
  public static void main(String[] args) {

// Create a program that asks for a number and prints the multiplication table with that number

    Scanner scanner = new Scanner(System.in);
    System.out.println("number plez");
    int inputNumber = scanner.nextInt();
    for (int i = 1; i < 11; i++) {
      System.out.println(i + " * " + inputNumber + " = " + (i * inputNumber));
    }


  }
}
