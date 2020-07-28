package FleetOfThings;


public class Thing {
  private String name;
  private boolean completed;

  public Thing(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

//  public void undo() {
//    this.completed = false;
//  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }
}
