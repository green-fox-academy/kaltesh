import java.util.ArrayList;
import java.util.HashMap;

public class mr {
  public static void main(String[] args) {
    wow();  // ctlr + alt + m
    ArrayPractice();
    multi();
    hashMap();
  }

  private static void ArrayPractice() {
    ArrayList<String> list = new ArrayList<>();
    list.add("one");
    list.add("two");
    list.remove("one");
    list.remove(0);
    //    list.remove(new Integer(1));
//    System.out.println(list.get(0));
    System.out.println(list.isEmpty());
  }

  private static void wow() {
    int a = 6;
    int b = 7;
    System.out.println(a + b);
    System.out.println("easy function");
  }

  public static void multi() {


    ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
    ArrayList<Integer> list1 = new ArrayList<>();
    list1.add(0);
    list1.add(1);
    matrix.add(list1);
    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(1);
    list2.add(2);
    matrix.add(list2);
    System.out.println(matrix);
  }

  public static void hashMap() {
    HashMap<String, Integer> map = new HashMap<>();
    map.put("apple", 153);
    System.out.println(map.get((153)));
  }

}

