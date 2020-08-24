package roomcleaningservice;

import java.util.List;

public class Street {
  private String name;
  private Boolean isStreetOpen;
  private List<House> houses;

  public Street(String name, Boolean isStreetOpen){
    this.name = name;
    this.isStreetOpen = isStreetOpen;
    this.houses = null;
  }

  public Boolean getStreetOpen() {
    return isStreetOpen;
  }
}
