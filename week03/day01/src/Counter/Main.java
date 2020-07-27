package Counter;

public class Main {
  public static void main(String[] args) {


    Counter counter = new Counter(66);
    System.out.println(counter.getCount());
    counter.add();
    System.out.println(counter.getCount());
    counter.add(15);
    System.out.println(counter.getCount());
    counter.reset();
    System.out.println(counter.getCount());
  }

}
