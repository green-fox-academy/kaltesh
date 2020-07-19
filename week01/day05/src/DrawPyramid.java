import java.sql.SQLOutput;
import java.util.SortedMap;
import java.util.Scanner;
import javax.sound.midi.Soundbank;


public class DrawPyramid {
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
    System.out.println("pyramidy number plez:");
    int pyramidNumber = scanner.nextInt();
    for (int i = 0; i <= pyramidNumber - 1; i++) {
      for (int k = pyramidNumber; k > i; k--) {
        System.out.print(" ");
      }
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      for (int l = 1; l <= i; l++) {
        System.out.print("*");
      }
      System.out.println();
    }
//    for (int i = 1; i <= pyramidNumber - 1; i++) {
//      for (int k = 0; k <= i; k++) {
//        System.out.print(" ");
//      }
//      for (int j = pyramidNumber; j > i; j--) {
//        System.out.print("*");
//      }
//      for (int l = pyramidNumber - 1; l > i; l--) {
//        System.out.print("*");
//      }
//      System.out.println();
//    }
  }
}