

public class Doubling {
  public static void main(String[] args) {
// - Create an integer variable named `baseNum` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(baseNum)`
    int baseNum = 123;
    int tester = 66;
    System.out.println(doubling(tester));
    System.out.println(doubling(baseNum));

  }

  public static int doubling(int input) {
    int theResult = input * 2;
    return theResult;
  }
}