package roomcleaningservice;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import java.util.ArrayList;
import java.util.List;

public class House {
  private String nameOfOwner;
  private Boolean hasPermitToBeCleaned;
  private List<Room> rooms;

  public House(String nameOfOwner, Boolean hasPermitToBeCleaned) {
    this.nameOfOwner = nameOfOwner;
    this.hasPermitToBeCleaned = hasPermitToBeCleaned;
    this.rooms = null;
  }

  public Boolean getHasPermitToBeCleaned() {
    return hasPermitToBeCleaned;
  }
}
