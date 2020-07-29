public class Power {
  public static void main(String[] args) {
//    Power
//    Given base and n that are both 1 or more,
//    compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
    System.out.println(power(3, 3));
  }
  public static int power(int base, int count) {
    if (count == 0) {
      return 1;
    }
    return
        base * power(base, count - 1);
  }
}
//  public static int factorialWithRecursion(int n) {
//    if (n == 1) {
//      return 1;
//    } else {
//      return 2 + factorialWithRecursion(n - 1);
//    }
//  }
// Here second argument is zero
//        result = Math.pow(1254, 0);
//            System.out.println(result);
//
//             Here second argument is one
//            result = Math.pow(5, 1);
//            System.out.println(result);


