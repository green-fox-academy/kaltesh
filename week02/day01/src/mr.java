import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.SortedMap;
import java.util.Scanner;


public class mr {
  public static void main(String[] args) {

//
//    int[] numbers; // deaclare only
//    numbers = new int[] {1, 4, 5, 6}; // after declaration
    int[] numbers = {12, 1, 4, 5, 6, 15, 23, 5};
//  displaying content
//    for (int thing : numbers) {
//      System.out.println(thing);
//    }
//
//    for (int i = 0; i < numbers.length; i++) {
//      int things = numbers[i];
//      System.out.println(things);
//  }
//  sorting
//    Arrays.sort(numbers);


    //    System.out.println(Arrays.toString(numbers));
//    System.out.println("see " + numbers[1] + " of " + numbers.length);
//    int multiArray[][] = {    // == int[] multiArray[] = ...
//        {2, 4, 5},
//        {1, 2, 3},
//        {5, 6, 7}
//    };
    bubbleSort(new int[] {6, 4, 6, 4, 2});


  }

  public static void bubbleSort(int[] numbers) {

    for (int j = 0; j < numbers.length; j++) {
      boolean csereVoltMar = false;
      for (int i = 0; i < numbers.length - 1; i++) {
        if (numbers[i] > numbers[i + 1]) {
          int segedValtozo = numbers[i];
          numbers[i] = numbers[i + 1];
          numbers[i + 1] = segedValtozo;
          csereVoltMar = true;
        }
      }
      if (!csereVoltMar) {
        break;
      }
      System.out.println(Arrays.toString(numbers));
    }
  }
}


