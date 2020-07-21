public class TodoPrint {
  public static void main(String... args) {
    String todoText = " - Buy milk\n";
    String diablo = "    - Diablo \n";
    todoText = todoText.concat(" - Download games\n");
    todoText = todoText.concat(diablo);
    StringBuilder sb = new StringBuilder(todoText);
    sb.insert(0, ("My todo\n"));
    System.out.println(sb);


    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText but with indention

    // Expected output:

    // My todo:
    //  - Buy milk
    //  - Download games
    //      - Diablo

  }
}