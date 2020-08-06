package ModelString;

public class Violin extends StringedInstrument {

  public Violin() {
    super(4);
  }

  public Violin(int numberOfStrings) {
    super(numberOfStrings);

  }

  @Override
  public String sound() {
    return "Screech";
  }

  @Override
  public void play() {
    System.out.println(getClass().getSimpleName() + "a " + super.getNumberOfStrings() +
        "-stringed instrument that goes " + sound());
  }
}
