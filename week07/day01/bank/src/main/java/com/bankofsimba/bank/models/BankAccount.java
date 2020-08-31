package com.bankofsimba.bank.models;

public class BankAccount {
  private String name;
  private int balance;
  private String animalType;
  private boolean isKing;
  private boolean isBadGuy;

  public BankAccount(String name, int balance, String animalType, boolean isKing,
                     boolean isBadGuy) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.isBadGuy = isBadGuy;
  }

  public void raiseBalance() {
    balance += isKing ? 100 : 10;
//    if (isKing == true) {
//      balance += 100;
//    } else {
//      balance += 10;
//    }
  }

  public String getName() {
    return name;
  }


  public int getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public boolean getIsKing() {
    return isKing;
  }

  public boolean getIsBadGuy() {
    return isBadGuy;
  }


  public void setName(String name) {
    this.name = name;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }


  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public void setIsBadGuy(boolean badGuy) {
    isBadGuy = badGuy;
  }

  public void setIsKing(boolean king) {
    isKing = king;
  }
}

