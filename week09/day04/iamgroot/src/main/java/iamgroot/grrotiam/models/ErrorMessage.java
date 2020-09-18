package iamgroot.grrotiam.models;

public class ErrorMessage {
  private String error;

  public ErrorMessage(String error) {
    this.error = error;
  }

  public ErrorMessage() {

    this.error = "I am Groot! but not groot";
  }

  public String getError() {
    return error;
  }
}
