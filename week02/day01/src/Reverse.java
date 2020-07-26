public class Reverse {
  public static void main(String[] args) {
    // - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `numbers`
// - Print the elements of the reversed `numbers`

    int[] numbers = {3, 4, 5, 6, 7};
    int[] reversed = new int[numbers.length];

    for (int i = 0; i < numbers.length; i++) {
      reversed[i] = numbers[numbers.length - i - 1];
      System.out.print(reversed[i]);
    }
//    for (int i = numbers.length - 1; i >= 0; i--) {//
//      reversed[i] = numbers[numbers.length - i - 1];
//      System.out.print(reversed[i];
  }
}
