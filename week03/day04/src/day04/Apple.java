package day04;

import java.util.ArrayList;

public class Apple {
  public static void main(String[] args) {
    String apple = "apple";
    System.out.println(getApple());
    ArrayList<Integer> numbersList = new ArrayList<>();
    System.out.println(summer(numbersList));
  }

  public static String getApple() {
    return "apple";
  }

  public static int summer(ArrayList<Integer> numbersListFuncI) {
    int sum = 0;
    for(int i = 0; i < numbersListFuncI.size(); i++)
    {
      sum += numbersListFuncI.get(i);
    }
    return sum;
  }
  }





//  Sum
//  Create a sum method in your class which has an ArrayList of Integers as parameter
//      It should return the sum of the elements in the list
//  Follow these steps:
//  Add a new test case
//  Instantiate your class
//  create a list of integers
//          use the assertEquals to test the result of the created sum method
//          Run them
//          Create different tests where you test your method with:
//  an empty list
//  a list that has one element in it
//  a list that has multiple elements in it
//  a null
//  Run them
//  Fix your code if needed
