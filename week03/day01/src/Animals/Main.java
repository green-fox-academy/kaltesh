package Animals;

public class Main {
  public static void main(String[] args) {

    Animals animal = new Animals();
    System.out.println(animal.getHunger());
    System.out.println(animal.getThirst());
    for (int i = 0; i < 6; i++) {
      animal.play();
    }
    System.out.println(animal.getHunger());
    System.out.println(animal.getThirst());
    for (int i = 0; i < 10; i++) {
      animal.eat();
      animal.drink();
    }
    System.out.println(animal.getHunger());
    System.out.println(animal.getThirst());
  }
}
