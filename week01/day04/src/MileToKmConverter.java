import java.sql.SQLOutput;
import java.util.SortedMap;
import java.util.Scanner;


public class MileToKmConverter {
  public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    System.out.println("value in km mile:");
    double userInputKM = scanner.nextDouble();
    System.out.println((userInputKM / 1.61) + " Is your distance in km");

  }
}