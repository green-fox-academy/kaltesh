package com.todo.list.models;


public class Todo {
  private String name;
  private boolean isComplete;
  private boolean isUrgent;
  private int id;



  public boolean isUrgent() {
    return isUrgent;
  }

  public void setUrgent(boolean urgent) {
    isUrgent = urgent;
  }

  public Todo(String name, int id) {
    this.name = name;
    this.isComplete = false;
    this.isUrgent = false;
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isComplete() {
    return isComplete;
  }

  public void setComplete(boolean complete) {
    isComplete = complete;
  }
}