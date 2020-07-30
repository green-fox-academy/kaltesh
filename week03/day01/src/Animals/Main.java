package Animals;

public class Main {
  public static void main(String[] args) {

    Animals animal = new Animals();
    Farm theFarm = new Farm();
//    System.out.println(animal.getHunger());
//    System.out.println(animal.getThirst());
//    for (int i = 0; i < 2; i++) {
//      animal.play();
//    }
//    System.out.println(animal.getHunger());
//    System.out.println(animal.getThirst());

//    System.out.println(animal.getHunger());
//    System.out.println(animal.getThirst());
//    for (int i = 0; i < 2; i++) {
//      farm.breed();
//    System.out.println(farm.getAnimalsNumber());
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
//    for (int i = 0; i < theFarm.slots; i++) {
//      System.out.println(theFarm.getAnimal(i).getHunger());
//    }
      theFarm.slaughter();
      System.out.println(theFarm.getNumberOfAnimals());

    }
  }
}
//  Reuse your Animal class
//  Create a Farm class
//    it has list of Animals
//    it has slots which defines the number of free places for animals
//    breed() -> creates a new animal if there's place for it
//    slaughter() -> removes the least hungry animal
