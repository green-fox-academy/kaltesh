package TheGarden;

public class Tree extends Plant {

  public Tree(String color) {
    super(color, 10);
    this.waterAbsorbingModifier = 0.4;
//    this.needsWater = (waterAmount < 10);

  }


  @Override
  public boolean isThePlantThirsty() {
    return (super.getWaterAmount() < super.getThirstLimit());
  }


  @Override
  public void addTheRightAmountOfWater(double theRightAmountOfWater) {
    super.addTheRightAmountOfWater(theRightAmountOfWater * this.waterAbsorbingModifier);
  }
}

