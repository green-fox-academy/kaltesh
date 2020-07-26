public class Factorio {
  public static void main(String[] args) {
    //  Create the usual class wrapper
//  and main method on your own.
// - Create a function called `factorio`
//   that returns it's input's factorial
    System.out.println(factorio(5));
  }

  public static int factorio(int multiplied) {
    if (multiplied == 0) {
      return 1;
    }
    int theResult = multiplied * factorio(multiplied - 1);
    return theResult;
  }
}
