import java.util.ArrayList;
import java.util.Arrays;

public class List2 {
  public static void main(String[] args) {

    ArrayList<String> listA = new ArrayList<>();
    listA.add("Apple");
    listA.add("Avocado");
    listA.add("Blueberries");
    listA.add("Durian");
    listA.add("Lychee");

    ArrayList<String> listB = new ArrayList<>();
    listB = listA;
//    System.out.println(listB.get(4));
    listB.remove("Durian");
//    for (int i = 0; i < listB.size(); i++) {
//      System.out.println(listB.get(i));
    if (listA.contains("Durian")) {
      ;
    }
    {
      System.out.println("yes durian in A");
    }
    listA.add(2, "Kiwifruit");
//    for (int i = 0; i < listA.size(); i++) {
//      System.out.println(listA.get(i));
//    }
    if (listA.size() > listB.size()) {
      System.out.println("a ia bigger");
    } else {
      System.out.println("b is bigger");
    }
    System.out.println("indexofavocadois: " + listA.indexOf("Avocado"));
    System.out.println("index of durian" + listB.indexOf("Durian: "));

    listB.addAll(Arrays.asList("PassionFruit", "Pomelo"));
    System.out.println(listA.get(3));
    ;


    //    # List introduction 2
//        - Create a list ('`List A`') which contains the following values
//  ```text
//        Apple, Avocado, Blueberries, Durian, Lychee
//  ```
//    - Create a new list ('`List B`') with the values of `List A`
//    - Print out whether `List A` contains Durian or not
//    - Remove Durian from `List B`
//    - Add Kiwifruit to `List A` after the 4th element
//    - Compare the size of `List A` and `List B`
//    - Get the index of Avocado from `List A`
//    - Get the index of Durian from `List B`
//    - Add Passion Fruit and Pomelo to `List B` in a single statement
//    - Print out the 3rd element from `List A`
  }
}