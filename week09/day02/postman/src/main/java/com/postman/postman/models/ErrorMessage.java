package com.postman.postman.models;

public class ErrorMessage {

  private String error;

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public ErrorMessage(String error) {
    this.error = error;
  }
}
