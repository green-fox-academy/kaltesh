import java.sql.SQLOutput;
import java.util.SortedMap;
import java.util.Scanner;
import javax.sound.midi.Soundbank;

public class DrawDiaSquare {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("squarey number plez:");
    int squareNumber = scanner.nextInt();
//    int squareNumber = 8;
    for (int i = 0; i < squareNumber; i++) {
      System.out.print("%");
    }
    System.out.println();
    for (int i = 0; i < squareNumber - 2; i++) {
      System.out.print("%");
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      System.out.print("%");
      for (int j = squareNumber - 2; j > i + 1; j--) {
        System.out.print(" ");
      }
      System.out.println("%");
    }
    for (int i = 0; i < squareNumber; i++) {
      System.out.print("%");
    }
  }
}