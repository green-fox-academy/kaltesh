package ModelString;

public abstract class StringedInstrument extends Instrument {
  private int numberOfStrings;
  public abstract String sound();

  public StringedInstrument(int numberOfStrings){
    this.numberOfStrings = numberOfStrings;
  }

  public int getNumberOfStrings() {
    return numberOfStrings;
  }
}
//  introduces numberOfStrings and
//    sound() method what's implementation is yet unknown
//    but with the help of the sound() the play() method is fully implementable
//    StringedInstrument has 3 descendants, namely:-