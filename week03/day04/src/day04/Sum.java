package day04;

import java.util.ArrayList;
import java.util.List;

//public class NumberList {
//  private ArrayList<Integer> numbersList;
//  }
public class Sum {
  private List<Integer> integers;

  public void setIntegers(List<Integer> integers) {
    this.integers = integers;
  }

  public Integer sum() {
    if (integers == null) {
      return null;
    }
    int sum = 0;
    for (Integer i : integers) {
      sum += i;
    }
    return sum;
  }
}
//    numbersList.add(10);
//    numbersList.add(100);
//    numbersList.add(1000);
//    numbersList.add(10000);
//    System.out.println(summer(numbersList));
//}
