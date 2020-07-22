import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;


public class WriteSingleLine {
  public static void main(String[] args) {
    List<String> toFile = new ArrayList();
    toFile.add("Mike");
    addMe(toFile);
  }

  private static void addMe(List<String> toFile) {
    try { // Required by Files.write(filePath, content)
      // Creates a new file if not exists and overwrites it's content
      // The elements of the content lists will become the lines of the file
      Path filePath = Paths.get("my-file.txt");
      Files.write(filePath, toFile);
    } catch (Exception e) {
      System.out.println("Uh-oh, could not write the file!");
    }
  }
}