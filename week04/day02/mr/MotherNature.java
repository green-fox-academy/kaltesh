package mr;


public class MotherNature {
  public static void main(String[] args) {
    MagicalForest magicalForest = new MagicalForest();
    Animal wolf = new Wolf("male");
    Animal penguin = new Penguin("female");
    magicalForest.addAnimal(wolf);
    magicalForest.addAnimal(penguin);
    magicalForest.carnival();
    magicalForest.fillForest(6);
    magicalForest.carnival();

  }

}
