import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
  public static void main(String[] args)
  {
    fileName(Paths.get("my-file.txt"));
  }

  private static void fileName(Path file) {
    try {
      List<String> list = Files.readAllLines(file);
      System.out.println(list.size());
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("0");
    }
//    System.out.println(file);
  }
}



// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.