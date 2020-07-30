package Animals;

import java.util.ArrayList;
import java.util.List;

public class Farm {
  List<Animals> animalsOnFarm = new ArrayList<>();
  int slots;

  public Farm() {
    this.slots = 10;
  }

  public Farm(List<Animals> animalsOnFarm) {
    this.animalsOnFarm = animalsOnFarm;
  }

  public int getNumberOfAnimals() {
    return animalsOnFarm.size();
  }

  public Animals getAnimal(int index) {
    return animalsOnFarm.get(index);
  }

  public void breed() {
    if (animalsOnFarm.size() < slots) {
      animalsOnFarm.add(new Animals());
    } else {
      System.out.println("Too many animals!");
    }
  }

  public void slaughter() {
    int starterHungry = animalsOnFarm.get(0).getHunger();
    Animals leastHungry = animalsOnFarm.get(0);
    for (int i = 0; i < animalsOnFarm.size(); i++) {
      if (animalsOnFarm.get(i).getHunger() < starterHungry) {
        starterHungry = animalsOnFarm.get(i).getHunger();
        leastHungry = animalsOnFarm.get(i);
      }
    }
    animalsOnFarm.remove(leastHungry);

  }
}