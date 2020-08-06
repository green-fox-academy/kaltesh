package mr;
public class Penguin extends Animal {

  public Penguin(String sex) {
    super(sex, 2);
  }

  @Override
  public void introduce() {
    System.out.println(
        "Hello I am a " + super.getSex() + " " + this.getClass().getSimpleName() +
            ". Wolf will eat me" +
            ". I am " + super.getAge() + " years old" +
            ". I have " + super.getLegs() + " legs." +
            "háp-háp");
  }
}