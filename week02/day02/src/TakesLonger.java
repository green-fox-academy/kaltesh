public class TakesLonger {
  public static void main(String... args) {
    String quote =
        "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
    String inQuote = "|||always takes longer than|||";
    // When saving this quote a disk error has occurred. Please fix it.
    // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
    // Using pieces of the quote variable (instead of just redefining the string)

    addString(quote, inQuote);
  }

  private static void addString(String quote, String inQuote) {
    StringBuilder sb = new StringBuilder(quote);
    sb.insert(21, (inQuote));
    System.out.println(sb);
  }
}

