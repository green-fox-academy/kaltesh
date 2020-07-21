import java.util.Arrays;

public class DiagonalMatrix {
  public static void main(String[] args) {
    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output
//    int[][] dynArray = {
//        {1, 2, 3, 4},
//        {1, 2, 3, 4},
//        {1, 2, 3, 4},
//        {1, 2, 3, 4}
//    };
    int dynArray[][];
    dynArray = new int[][]
        {
            {

            }
        };


//

    for (int i = 0; i < dynArray.length; i++) {
      for (int j = 0; j < dynArray[i].length; j++) {
        System.out.print(dynArray[i][j] + " ");
      }
      System.out.println();
    }
  }
}