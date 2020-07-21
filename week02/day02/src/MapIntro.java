import java.util.HashMap;
import java.util.Map;

public class MapIntro {
  public static void main(String[] args) {

    Map<Integer, String> leMap = new HashMap<>();
    leMap.put(97, "a");
    leMap.put(98, "b");
    leMap.put(99, "c");
    leMap.put(65, "A");
    leMap.put(66, "B");
    leMap.put(67, "C");


    System.out.println(leMap.isEmpty());
    System.out.println(leMap.keySet());
    System.out.println(leMap.values());

    leMap.put(68, "D");
    System.out.println(leMap.size());
    System.out.println(leMap.get(99));

//    if (leMap.equals)

    if (leMap.get(100) == null) {
      System.out.println("no association with 100");
          }
    leMap.clear();
    System.out.println("empty, is it true?  " + (leMap.isEmpty()));
  }
}
//    for (int i = 0; i < leMap.size(); i++) {
//      leMap.remove;
//    Map introduction 1
//    We are going to play with maps. Feel free to use the built-in methods where possible.
//        Create an empty map where the keys are integers and the values are characters
//    Print out whether the map is empty or not
//    Add the following key-value pairs to the map
//    97	a
//    98	b
//    99	c
//    65	A
//    66	B
//    67	C
//    Print all the keys
//    Print all the values
//    Add value D with the key 68
//    Print how many key-value pairs are in the map
//    Print the value that is associated with key 99
//    Remove the key-value pair where with key 97
//    Print whether there is an associated value with key 100 or not
//    Remove all the key-value pairs

