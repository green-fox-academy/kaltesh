import java.util.HashMap;
import java.util.Map;

public class MapIntro2 {
  public static void main(String[] args) {
    Map<String, String> phoneBookMap = new HashMap<>();
    phoneBookMap.put("978-1-60309-452-8", "A Letter to Jo");
    phoneBookMap.put("978-1-60309-459-7", "Lupus");
    phoneBookMap.put("978-1-60309-444-3", "Red Panda and Moon Bear");
    phoneBookMap.put("978-1-60309-461-0", "The Lab");
//    for (int i = 0; i < phoneBookMap.size(); i++) {
//      System.out.println(phoneBookMap.keySet());
//    }

    for (String line : phoneBookMap.keySet()) {
      System.out.println(phoneBookMap.get(line) + " ISBN (" + line + ")");
    }

    phoneBookMap.remove("978-1-60309-444-3");
//    phoneBookMap.remove("The Lab");

    for (String line : phoneBookMap.keySet()) {
      if (phoneBookMap.get(line).equals("The Lab")) {
        phoneBookMap.remove(line);
      }
    }

    for (String i : phoneBookMap.keySet()) {
      System.out.println(phoneBookMap.get(i) + " SB:  " + i + ".");
    }

    //    # Map introduction 2
//
//        - Create a map where the keys are strings and the values are strings with the
//    following initial values
//
//        | Key               | Value                   |
//  | :---------------- | :---------------------- |
//  | 978-1-60309-452-8 | A Letter to Jo          |
//  | 978-1-60309-459-7 | Lupus                   |
//  | 978-1-60309-444-3 | Red Panda and Moon Bear |
//  | 978-1-60309-461-0 | The Lab                 |
//
//        - Print all the key-value pairs in the following format
//  ```text
//    A Letter to Jo (ISBN: 978-1-60309-452-8)
//    Lupus (ISBN: 978-1-60309-459-7)
//    Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
//    The Lab (ISBN: 978-1-60309-461-0)
//  ```
//    - Remove the key-value pair with key 978-1-60309-444-3
//        - Remove the key-value pair with value The Lab
//        - Add the following key-value pairs to the map
//
//  | Key               | Value                 |
//  | :---------------- | :-------------------- |
//  | 978-1-60309-450-4 | They Called Us Enemy  |
//  | 978-1-60309-453-5 | Why Did We Trust Him? |
//
//    - Print whether there is an associated value with key 478-0-61159-424-8 or not
//    - Print the value associated with key 978-1-60309-453-5

  }
}
