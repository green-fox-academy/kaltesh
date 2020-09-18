package iamgroot.grrotiam.models;

public class TheMessage {
  private String received;
  private String translated;


  public TheMessage(String received) {
    this.received = received;
    this.translated = "I am Groot!";
  }
  public TheMessage() {}


  public String getReceived() {
    return received;
  }

  public String getTranslated() {
    return translated = translated;
  }
}
