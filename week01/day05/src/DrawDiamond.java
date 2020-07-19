import java.sql.SQLOutput;
import java.util.SortedMap;
import java.util.Scanner;
import javax.sound.midi.Soundbank;

public class DrawDiamond {
  public static void main(String[] args) {

// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

    Scanner scanner = new Scanner(System.in);
    System.out.println("diamondy number plez:");
    int diamondNumber = scanner.nextInt();
    for (int i = 0; i <= diamondNumber - 1; i++) {
      for (int k = diamondNumber; k > i; k--) {
        System.out.print(" ");
      }
      for (int j = 0; j <= 2 * i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = 1; i <= diamondNumber - 1; i++) {
      for (int k = 0; k <= i; k++) {
        System.out.print(" ");
      }
      for (int j = 2 * diamondNumber - 1; j > 2 * i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
