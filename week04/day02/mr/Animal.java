
package mr;

public class Animal {
  private int age;
  private String sex;
  private int legs;

  public Animal(String sex, int legs) {
    this.age = 0;
    this.sex = sex;
    this.legs = legs;
  }

  protected void introduce() {
    System.out.println("I am just an animal");
  }

  public int getAge() {
    return age;
  }

  public String getSex() {
    return sex;
  }

  public int getLegs() {
    return legs;
  }
}