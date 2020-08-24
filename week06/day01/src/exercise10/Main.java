package exercise10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {

    Fox foxy = new Fox("foxy", "green", 5);
    Fox foxer = new Fox("foxer", "blue", 8);
    Fox foki = new Fox("foki", "yellow", 6);
    Fox foxette = new Fox("fox", "green", 4);
    Fox mike = new Fox("mike", "green", 34);
    List<Fox> foxes = Arrays.asList(foxy, foxer, foki, foxette, mike);

    List<Fox> greenFoxes = foxes.stream()
        .filter(fox -> fox.getColor().equals("green"))
        .collect(Collectors.toList());
    System.out.println(greenFoxes);


    List<Fox> oldGreenFoxes = greenFoxes.stream()
        .filter(fox -> fox.getAge() >= 5)
        .collect(Collectors.toList());
    System.out.println(oldGreenFoxes);

    Map<String, List<Fox>> foxesByColor = foxes.stream()
        .collect(Collectors.groupingBy(Fox::getColor));
    System.out.println(foxesByColor);

//    Create a Fox class with 3 properties:name, color and age Fill a list with at least 5 foxes and:
//    Write a Stream Expression to find the foxes with green color!
//    Write a Stream Expression to find the foxes with green color, and age less then 5 years!
//    Write a Stream Expression to find the frequency of foxes by color!
  }
}