import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exercise06 {


  public static void main(String[] args) {
    String theText = "a GreenFox Once Fell Into A Fox Trap";
    theText.chars()
        .filter(x -> x == ((int)(Character.toString((char)x).toUpperCase()).charAt(0)))
        .forEach(x -> System.out.print((char)x));
  }
}

//    Write a Stream Expression to find the uppercase characters in a string!

