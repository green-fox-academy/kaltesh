import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import javax.sound.midi.Soundbank;

public class PrintEachLine {
  public static void main(String[] args) {

    try {
      List<String> myList = Files.readAllLines(Paths.get("my-file.txt"));
      for (String line : myList) {
        System.out.println(line);
      }



    } catch (IOException e) {
//      e.printStackTrace();
      System.out.println("no can do");
    }
  }
}