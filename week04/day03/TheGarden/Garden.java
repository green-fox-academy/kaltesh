package TheGarden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plant> plants;

  public Garden() {
    this.plants = new ArrayList<>();
  }

  public void addPlant(Plant plant) {
    this.plants.add(plant);
  }

//  public void watering() {
//    for (Plant plant : plants) {
//      System.out.println(
//          "is " + plant.getClass().getSimpleName() + " thirsty?   " + plant.isThePlantThirsty());
//
//    }
//  }

  public void theWateringOfThePlants(double theWholeAmountOfWater) {
        System.out.println("Watering with " + (int) theWholeAmountOfWater);

    double theAmountBeforeModifiers;
    int numberOfThirstyPlants = 0;
    for (Plant plant : plants) {
      if (plant.isThePlantThirsty()) {
        numberOfThirstyPlants++;
      }
    }
    theAmountBeforeModifiers = theWholeAmountOfWater / numberOfThirstyPlants;
    for (Plant plant : plants) {
      if (plant.isThePlantThirsty()) {
        plant.addTheRightAmountOfWater(theAmountBeforeModifiers);
      }
    }
    //
//  }
//}


//  }
//    for (Plant plant : plants) {
//      if (plant.needsWater) {
//        plant.waterAmount += (wateringAmount / howManyThirsty) * plant.waterAbsorbingModifier;
//      }
//    }
//    System.out.println("Watering with " + (int) wateringAmount);
//  }
    //  -------------------------------------------------------------------

    //  public double countingThirsty() {
//    int howManyThirsty = 1;
//
//    for (Plant plant : plants) {
//      if (plant.needsWater) {
//        ++howManyThirsty;
//      }
//    }
//    return howManyThirsty;
//  }
//
//  public void watering(double wateringAmount) {
//    countingThirsty();
//    for (Plant p : plants) {
//      if (p.needsWater) {
//        p.waterAmount += (wateringAmount / howManyThirsty) * p.waterAbsorbingModifier;
//        p.needsWater = (p.waterAmount < 5);
//      }
//    }
//}
//}
  }

  public void printGardenInfo() {
    for (Plant plant : plants) {
      if (plant.getWaterAmount() < plant.getThirstLimit()) {
        System.out.println(
            "The " + plant.getColor() + " " + plant.getClass().getSimpleName() +
                " needs water.");
      } else {
        System.out.println(
            "The " + plant.getColor() + " " + plant.getClass().getSimpleName() +
                " doesn't need water.");
      }
    }
  }
}
