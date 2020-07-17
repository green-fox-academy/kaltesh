import java.sql.SQLOutput;
import java.util.SortedMap;
import java.util.Scanner;

public class CodingHours  {
  public static void main(String[] args) {
//  coding hours
    int dailyHours = 6;
    int workDays = 5;
    int semester = 17;
    int allTheHours;
    allTheHours = (semester * workDays * dailyHours);
    System.out.println("hours spent coding: " + allTheHours);
    int averageHours = 52;
    float weeklyCode;
    weeklyCode = (workDays * dailyHours);
    System.out.println("percentage is: " + (weeklyCode / averageHours) * 100 + "%");
  }
}