import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class UnhandledException {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Denominator plez, better not be 0:  ");
    int leDivisor = scanner.nextInt();
    try {
      int leResult = 10 / leDivisor;
    } catch (ArithmeticException e) {
      System.out.println("what did i just say?");
    }
  }
}