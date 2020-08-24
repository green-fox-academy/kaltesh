package roomcleaningservice;

public class Room {
  private String nameOfTheRoom;
  private Boolean areShelvesClean;
  private Boolean areBooksSorted;
  private Boolean areCarpetsClean;
  private Boolean areTablesTidy;
  private Boolean areWindowsDirty;
  private Boolean isAirFresh;
  private Boolean isTheDoorOpen;

  public Room(String nameOfTheRoom) {
    this.nameOfTheRoom = nameOfTheRoom;
    this.areShelvesClean = true;
    this.areBooksSorted = true;
    this.areCarpetsClean = true;
    this.areTablesTidy = true;
    this.areWindowsDirty = true;
    this.isAirFresh = true;
    this.isTheDoorOpen = true;
  }

  public Boolean getTheDoorOpen() {
    return isTheDoorOpen;
  }

  public void setAreShelvesClean(Boolean areShelvesClean) {
    this.areShelvesClean = areShelvesClean;
  }

  public void setAreBooksSorted(Boolean areBooksSorted) {
    this.areBooksSorted = areBooksSorted;
  }

  public void setAreCarpetsClean(Boolean areCarpetsClean) {
    this.areCarpetsClean = areCarpetsClean;
  }

  public void setAreTablesTidy(Boolean areTablesTidy) {
    this.areTablesTidy = areTablesTidy;
  }

  public void setAreWindowsDirty(Boolean areWindowsDirty) {
    this.areWindowsDirty = areWindowsDirty;
  }

  public void setAirFresh(Boolean airFresh) {
    isAirFresh = airFresh;
  }
}

