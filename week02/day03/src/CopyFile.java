import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class CopyFile {

  public static void main(String[] args) {
    // Write a function that copies the contents of a file into another
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful

    String original = "original.txt";
    String copy = "copy.txt";

    System.out.print("Successfully copied the file: " +  copyFile(original, copy));

  }

  public static boolean copyFile(String copyFile, String pasteFile) {
    Path copyPath = Paths.get(copyFile);
    Path pastePath = Paths.get(pasteFile);

    try {
      List<String> copyLines = Files.readAllLines(copyPath);
      Files.createFile(pastePath);
      for (String oneLine : copyLines) {
        Files.write(pastePath, oneLine.concat("\n").getBytes(), StandardOpenOption.APPEND);
      }
      return true;
    } catch (IOException e) {
      return false;
    }
  }
}