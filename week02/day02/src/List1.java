import java.util.ArrayList;

public class List1 {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("William");
    int counter = names.size();
    names.add("John");
    names.add("Amanda");
    int counter2 = names.size();
    System.out.println("I think this is the number of elements should be one atm: " + counter);
    System.out.println("I think this is the number of elements should be three atm: " + counter2);
    System.out.println("names of the 3rd character: " + names.get(2));
    System.out.println(names);


    for (int i = 0; i < names.size(); i++) {
      System.out.println("names listed here:  \n" + (i + 1) + " " + names.get(i));
    }

    for (int i = names.size() - 1; i >= 0 ; i--) {
      System.out.println("names revved here:  " + names.get(i));
    }
    names.clear();
    System.out.println(names.isEmpty());
  }
}
//  We are going to play with lists. Feel free to use the built-in methods where possible.
//
//    Create an empty list which will contain names (strings)
//    Print out the number of elements in the list
//    Add William to the list
//    Print out whether the list is empty or not
//    Add John to the list
//    Add Amanda to the list
//    Print out the number of elements in the list
//    Print out the 3rd element
//    Iterate through the list and print out each name
//    William
//    John
//    Amanda
//    Iterate through the list and print
//    1. William
//    2. John
//    3. Amanda
//    Remove the 2nd element
//    Iterate through the list in a reversed order and print out each name
//    Amanda
//    William