package Animals;

public class Main {
  public static void main(String[] args) {

    Animals animal = new Animals();
    Farm theFarm = new Farm();
    for (int i = 0; i < 8; i++) {
      theFarm.breed();
    }
    for (int i = 0; i < 2; i++) {
      animal.eat();
      animal.drink();
//    }
      System.out.println(animal.getThirst());
      System.out.println(theFarm.getNumberOfAnimals());
      theFarm.getAnimal(4).eat();
      theFarm.slaughter();
      System.out.println(theFarm.getNumberOfAnimals());

    }
  }
}