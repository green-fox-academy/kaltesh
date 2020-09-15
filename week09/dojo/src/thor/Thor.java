package thor;

import java.sql.SQLOutput;

public class Thor {

  private int age;
  private String name;
  private Boolean male;


  public Thor(int age, String name, Boolean male) {
    this.age = age;
    this.name = name;
    this.male = male;
  }

  public static void main(String[] args) {
    Thor hort = new Thor(32, "ferii", true);
    Thor thort = new Thor(38, "janii", true);

  }
}
