import java.sql.SQLOutput;
import java.util.SortedMap;
import java.util.Scanner;
import javax.sound.midi.Soundbank;


public class DrawTriangle {
  public static void main(String[] args) {


    // Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
//The triangle should have as many lines as the number was

    Scanner scanner = new Scanner(System.in);
    System.out.println("triangly number plez:");
    int triangleNumber = scanner.nextInt();

//    for (int i = 0; i < triangleNumber; i++) {
//      System.out.print("*".repeat(i));
//      for (int j = 0; j < 1; j++) {
//        System.out.println("*");
//      }
//    }
//    int triangleNumber = 5;

    for (int i = 0; i < triangleNumber; i++) {
      for (int j = 0; j < i; j++)
        System.out.print("*");
        System.out.println();

    }

  }
}