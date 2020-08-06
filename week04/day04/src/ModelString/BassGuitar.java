package ModelString;

public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    super(6);
  }

  public BassGuitar(int numberOfStrings) {
    super(numberOfStrings);
  }

  @Override
  public String sound() {
    return "Duum-duum-duum";

  }

  @Override
  public void play() {
    System.out.println(getClass().getSimpleName() + "a " + super.getNumberOfStrings() +
        "-stringed instrument that goes " + sound());

  }
}
