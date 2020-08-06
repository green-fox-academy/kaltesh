package TheGarden;

import jdk.swing.interop.SwingInterOpUtils;

public class MyMain {
  public static void main(String[] args) {
//  ----------------------------------TESTING AREA-------------------------------------------//
    Garden garden = new Garden();

    Flower yellow = new Flower("yellow");
    Flower blue = new Flower("blue");
    Tree purple = new Tree("purple");
    Tree orange = new Tree("orange");

    garden.addPlant(yellow);
    garden.addPlant(blue);
    garden.addPlant(purple);
    garden.addPlant(orange);
//    garden.theWateringOfThePlants();

    garden.printGardenInfo();
    garden.theWateringOfThePlants(40);
    garden.printGardenInfo();
    garden.theWateringOfThePlants(70);
    garden.printGardenInfo();

  }
}


//------------------------------------TESTING AREA------------------------------------------//


