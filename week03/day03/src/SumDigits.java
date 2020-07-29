public class SumDigits {
//  Sum Digits
//  Given a non-negative integer n, return the sum of its digits recursively (without loops).
////  Hint
//  Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)


  public static void main(String[] args) {

    System.out.println(sum(1111111));
  }

  public static int sum(int number) {
    if (number == 0) {
      return number;
    }
    number =  (number % 10) + sum(number / 10);
    return number;
  }
}

//    number = number + sum(number - 1);
//    return number;
//    number = number % 10;
//    number /= 10;
//    return number;


