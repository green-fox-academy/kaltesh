import java.util.Arrays;

public class SwapElements {
  public static void main(String[] args) {

// - Create an array variable named `orders`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `orders`

    String[] orders = {"first", "second", "third"};
    String sillyVar = orders[0];
    orders[0] = orders[2];
    orders[2] = sillyVar;
    System.out.println(orders);
    System.out.println(Arrays.toString(orders));
  }
}
