package ModelString;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    super(6);

  }

  public ElectricGuitar(int numberOfStrings) {
    super(numberOfStrings);
  }

  @Override
  public String sound() {
    return "Twang";
  }

  @Override
  public void play() {
    System.out.println(getClass().getSimpleName() + "a " + super.getNumberOfStrings() +
        "-stringed instrument that goes " + sound());
  }
}
