package mr;

import java.util.ArrayList;
import java.util.List;

public class MagicalForest {
  List<Animal> animals;

  public MagicalForest() {
    this.animals = new ArrayList<>();
  }

  public void fillForest(int numberOfAnimals) {
    for (int i = 0; i < numberOfAnimals; i++) {
      animals.add(spawnRandomAnimal());
    }
  }

  private Animal spawnRandomAnimal() {
    if ((int) (Math.random() * 2 + 1) % 2 == 0) {
      return new Wolf("male");
    } else {
      return new Penguin("male");
    }
  }

  public void addAnimal(Animal animal) {
    this.animals.add(animal);
  }

  public void carnival() {
    for (Animal animal : animals) {
//      ((Wolf) animal).introduce(3);
      if (animal instanceof Wolf) {
        ((Wolf) animal).introduce(2);
      } else {
        animal.introduce();
      }
    }
  }
}