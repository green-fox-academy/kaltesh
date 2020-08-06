package TheGarden;

public class Flower extends Plant {

  public Flower(String color) {
    super(color, 5);
    this.waterAbsorbingModifier = 0.75;
//    this.needsWater = (waterAmount < 5);
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