import java.sql.SQLOutput;
import java.util.SortedMap;
import java.util.Scanner;
import javax.sound.midi.Soundbank;


public class day5 {
  public static void main(String[] args) {

//Create a program that writes this line 100 times:
//"I won't cheat on the exam!"

//    for (int i = 0; i < 100; i++)
//    System.out.println("I Won't Cheat On The Exam");

// Create a program that prints all the even numbers between 0 and 500

//    for (int i = 0; i < 500; i++) {
//      if (i % 2 == 0) {
//        System.out.println(i);
//      }
//    }


// Create a program that asks for a number and prints the multiplication table with that number
//
// Example:
// The number 15 should print:
//
// 1 * 15 = 15
// 2 * 15 = 30
// 3 * 15 = 45
// 4 * 15 = 60
// 5 * 15 = 75
// 6 * 15 = 90
// 7 * 15 = 105
// 8 * 15 = 120
// 9 * 15 = 135
// 10 * 15 = 150

//    Scanner scanner = new Scanner(System.in);
//    System.out.println("number plez");
//    int inputNumber = scanner.nextInt();
//    for (int i = 1; i < 11; i++) {
//      System.out.println(i + " * " + inputNumber + " = " + (i * inputNumber));
//    }

// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5

//    Scanner scanner = new Scanner(System.in);
//    System.out.println("2 numbers plez");
//    int inputNumber01 = scanner.nextInt();
//    int inputNumber02 = scanner.nextInt();
//    if ((inputNumber01) >= (inputNumber02)) {
//      System.out.println("The second number should be bigger");
//    } else {
//      for (int i = inputNumber01; i < inputNumber02; i++) {
//        System.out.println(i);
//      }
//    }


// Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.

//    for (int i = 1; i < 101; i++) {
//      if (i % 3 == 0 && i % 5 == 0) {
//        System.out.println("FizzBuzz");
//      } else if (i % 5 == 0) {
//        System.out.println("Buzz");
//      } else if (i % 3 == 0) {
//        System.out.println("Fizz");
//      } else {
//        System.out.println(i);
//      }
//    }


    // Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

//    Scanner scanner = new Scanner(System.in);
//    System.out.println("triangly number plez:");
//    int triangleNumber = scanner.nextInt();
//    String x = "*";
//    int triangleNumber = 5;
//    for (int i = 0; i < triangleNumber; i++) {
//      System.out.print(i);
//      System.out.print("*".repeat(i));
//      for (int j = 0; j < 1; j++) {
//        System.out.println("*");
//      }
//    }

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
    int pyramidNumber = 4;
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("pyramidy number plez:");
//    int pyramidNumber = scanner.nextInt();
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
    for (int i = 0; i <= pyramidNumber - 1; i++) {
      for (int k = 0; k <= i; k++) {
        System.out.print(" ");
      }
      for (int j = pyramidNumber; j > i; j--) {
        System.out.print("*");
      }
      for (int l = pyramidNumber - 1; l > i; l--) {
        System.out.print("*");
      }
      System.out.println();
    }

  }
}