package Pirates;

import java.util.Random;

public class Pirate {
  private static int idCounter = 0;
  private static int genericIdCounter = 0;

  private final int id;
  private final String name;
  private int rumConsumed;
  private boolean isAwake;
  private boolean isAlive;

  public Pirate() {
    this("Generic Pirate #" + ++genericIdCounter);
  }

  public Pirate(String name) {
    this.id = idCounter++;
    this.name = name + " (id" + this.id + ")";
    this.rumConsumed = 0;
    this.isAwake = true;
    this.isAlive = true;
  }

  public void drinkSomeRum() {
    if (!this.isAlive) {
      this.writeDeadMessage();
      return;
    }
    this.rumConsumed++;
  }

  public void howsItGoingMate() {
    if (!this.isAlive) {
      this.writeDeadMessage();
      return;
    }
    if (this.rumConsumed < 5) {
      for (int i = 0; i < new Random().nextInt(5); i++) {
        System.out.println(this.name + ": Pour me anudder!");
        this.drinkSomeRum();
      }
    } else {
      System.out.println(this.name + ": Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      this.isAwake = true;
    }
  }

  public void brawl(Pirate otherPirate) {
    if (!this.isAlive) {
      this.writeDeadMessage();
      return;
    } else if (!otherPirate.isAlive()) {
      System.out.println(this.name + ": My enemy, " + otherPirate.getName() + ", is dead.");
      return;
    }
    switch (new Random().nextInt(3)) {
      case 0:
        this.die();
        break;
      case 1:
        otherPirate.die();
        break;
      case 2:
        this.passOut();
        otherPirate.passOut();
        break;
    }
  }

  public int getRumConsumed() {
    return rumConsumed;
  }

  public void passOut() {
    this.isAwake = false;
  }

  public boolean isAlive() {
    return isAlive;
  }

  public boolean isAwake() {
    return isAwake;
  }

  public String getName() {
    return name;
  }

  public void die() {
    isAlive = false;
  }

  public void writeDeadMessage() {
    System.out.println(this.name + ": I am dead.");
  }

  @Override
  public String toString() {
    return "\tName: " + this.name + "\n" +
        "\tRum consumed: " + this.rumConsumed + "\n" +
        "\tAlive: " + this.isAlive + "\n" +
        "\tAwake: " + this.isAwake + "\n";
  }
}