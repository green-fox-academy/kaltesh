
package mr;

public class Wolf extends Animal {

  public Wolf(String sex) {
    super(sex, 4);
  }

  public Wolf(int legs) {
    super("male", legs);
  }

  public Wolf(String sex, int legs) {
    super(sex, legs);
  }

  @Override
  public void introduce() {
    System.out.println(
        "Hello I am a " + super.getSex() + " " + this.getClass().getSimpleName() +
            ". I will eat you" +
            ". I am " + super.getAge() + " years old" +
            ". I have " + super.getLegs() + " legs.");
  }

  public void introduce(int numberOfIntroductions) {
    for (int i = 0; i < numberOfIntroductions; i++) {
      System.out.println(
          "Hello I am a " + super.getSex() + " " + this.getClass().getSimpleName() +
              ". I will eat you" +
              ". I am " + super.getAge() + " years old" +
              ". I have " + super.getLegs() + " legs.");
    }
  }
}