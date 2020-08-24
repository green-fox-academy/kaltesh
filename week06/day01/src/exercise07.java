import java.util.Arrays;
import java.util.List;

public class exercise07 {
  public static void main(String[] args) {
    List<String> cities = Arrays
        .asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM",
            "ABU DHABI", "PARIS");

    cities.stream()
        .filter(city -> city.toLowerCase().startsWith("n"))
        .forEach(System.out::println);


  }
}


//    Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:

