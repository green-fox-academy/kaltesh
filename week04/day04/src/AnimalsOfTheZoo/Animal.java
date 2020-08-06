package AnimalsOfTheZoo;

public abstract class Animal {
  private String name;
  private int age;
  private String sex;

  public String getName() {
    return name;
  }

  public abstract String breed();
}
