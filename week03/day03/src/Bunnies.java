public class Bunnies {
  public static void main(String[] args) {
    System.out.println(earCounter(55));
//    We have a number of bunnies and each bunny has two big floppy ears.
//    We want to compute the total number of ears across all the bunnies recursively
//    (without loops or multiplication).
//    }
//  }



  }
  public static int earCounter(int n) {
    int rabbitEars = 2;
    if (n == 0) {
      return 0;
    } else {
      return (rabbitEars  + earCounter(n - 1)) ;
    }
  }
}