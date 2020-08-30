package com.example.demo.model;

public class Item {
  private String name;
  private String description;
  private int price;
  private static int idCounter = 0;
  private int id;

  public int getId() {
    return id;
  }

  public Item(String name, String description, int price, int stockLevel) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.stockLevel = stockLevel;
    id = ++idCounter;

  }

  private int stockLevel;


  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public int getPrice() {
    return price;
  }

  public int getStockLevel() {
    return stockLevel;
  }


  public void setName(String name) {
    this.name = name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void setStockLevel(int stockLevel) {
    this.stockLevel = stockLevel;
  }
}

