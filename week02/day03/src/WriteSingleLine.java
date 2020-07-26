import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;


public class WriteSingleLine {
  public static void main(String[] args) {
    List<String> toFile = new ArrayList();
    String fileName = "my-file.txt";
    String toWrite = "Mikw";
    toFile.add("Mike");
    addMe(fileName, toWrite);
  }

//  private static void addMe(String fileName, String toWrite) {
//    Path path = Paths.get(fileName);
//    try { // Required by Files.write(filePath, content)
//       Creates a new file if not exists and overwrites it's content
//       The elements of the content lists will become the lines of the file
//      Files.write(Paths.get(fileName), toWrite.getBytes());
//    } catch (Exception e) {
//      System.out.println("Uh-oh, could not write the file!");
//    }

  public static void addMe(String fileName, String toWrite) {
    Path path = Paths.get(fileName);
    try {
      Files.createFile(path);
      Files.write(path, toWrite.getBytes());
    } catch (IOException e) {
      System.out.printf("Unable to write file: %s", fileName);
    }
  }
}