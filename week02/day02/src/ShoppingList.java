import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
  public static void main(String[] args) {
    //We are going to represent a shopping list in a list containing strings.

    //Create a list with the following items.
    ArrayList<String> shoppingList = new ArrayList<>();
    shoppingList.addAll(Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken"));

    System.out.println("do we have milk? " + shoppingList.contains("milk"));;
    System.out.println("do we have banana? " + shoppingList.contains("banana"));
//
//    Create an application which solves the following problems.
//    Do we have milk on the list?
//        Do we have bananas on the list?


  }
}