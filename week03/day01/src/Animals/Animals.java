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
    System.out.println("mlemmlemmlem");
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
//  Create an Animal class
//Every animal has a hunger value, which is a whole number
//        Every animal has a thirst value, which is a whole number
//        when creating a new animal object these values are created with the default 50 value
//    Every animal can eat() which decreases their hunger by one
//    Every animal can drink() which decreases their thirst by one
//    Every animal can play() which increases both by one