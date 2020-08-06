package TheGarden;

public class Plant {
  private String color;
  private float waterAmount;
  private int thirstLimit;
  //  boolean needsWater;
  double waterAbsorbingModifier;

  public Plant(String color, int thirstLimit) {
    this.color = color;
    this.waterAmount = 0;
    this.thirstLimit = thirstLimit;
  }

  public boolean isThePlantThirsty() {
    return false;
  }

  public void addTheRightAmountOfWater(double theModifiedAmountOfWater) {
    waterAmount += theModifiedAmountOfWater;
  }

  public int getThirstLimit() {
    return thirstLimit;
  }

  public float getWaterAmount() {
    return waterAmount;
  }

  public String getColor() {
    return color;
  }
}