import javax.swing.JFormattedTextField;

public class Reverse {
  public static void main(String... args) {
    String toBeReversed =
        ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    // Create a method that can reverse a String, which is passed as the parameter
    // Use it on this reversed string to check it!
    // Try to solve this using charAt() first, and optionally anything else after.
//    System.out.println(reverse(toBeReversed));
//    char 0 = toBeReversed.charAt(0);
//    System.out.println(ch4);
    String funkyTest = "987654321";
    System.out.println(reverse(toBeReversed));
    System.out.println(reverse(funkyTest));
  }

  public static String reverse(String textToReverse) {
    String reverse = "";
    for (int i = textToReverse.length() - 1; i >= 0; i--) {
      reverse += (textToReverse.charAt(i));
    }
    return reverse;
  }
}
