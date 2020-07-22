//import java.io.File;  -- NO GOOD /

import java.io.File;   // GOOD
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class mr {
  public static void main(String[] args) {

//    Files.createFile(Paths.get("test.txt"));
//    File file = new File("test.txt");
//    createFile();
//    System.out.println("jobDone");
//
//  }
//
//  public static void createFile() {
//    Scanner scanner = new Scanner(System.in);
//    String newFile = scanner.nextLine();
//    try {
//      Files.createFile(Paths.get(newFile));
//    } catch (IOException e) {
//      e.printStackTrace();
//      System.out.println("new plez");
//      createFile();   //
//    }
//
//    Scanner scanner = new Scanner(System.in);
//    String newFile = scanner.nextLine();
//
//    createFile(newFile);
//    System.out.println("jobDone");
//
//  }
//
//  public static void createFile(String newFile) {
//
//    try {
//      Files.createFile(Paths.get(newFile));
//    } catch (IOException e) {
//      e.printStackTrace();
//      System.out.println("new plez");
////      createFile();   //
//
//
//    }

  }
}