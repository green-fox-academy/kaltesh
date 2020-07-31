package Animals;

public class Animals {
  private int hunger;
  private int thirst;


  public Animals() {
    this.hunger = 50;
    this.thirst = 50;
  }

  public void eat() {
    --hunger;
    System.out.println("nomnomnom");
  }

  public void drink() {
    --thirst;
    System.out.println("mlemmlem mlem");
  }

  public void play() {
    ++thirst;
    ++hunger;
    System.out.println("yaaaaaaaaaaay");
  }

  public int getHunger() {
    return hunger;
  }

  public int getThirst() {
    return thirst;
  }
}