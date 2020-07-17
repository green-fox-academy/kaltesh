import java.sql.SQLOutput;
import java.util.SortedMap;
import java.util.Scanner;


public class SecondsInADay {
  public static void main(String[] args) {

    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;
    int allSeconds = (24 * 60 * 60);
    int secondsPassed = ((currentHours * 60 * 60) + (currentMinutes * 60) + currentSeconds);
    int secondsLeft = (allSeconds - secondsPassed);
    System.out.println("At 14:34:42, There's " + secondsLeft + " Seconds left from the day.");

  }
}