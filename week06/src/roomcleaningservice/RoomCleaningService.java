package roomcleaningservice;

import com.sun.xml.internal.ws.encoding.RootOnlyCodec;
import java.util.ArrayList;
import java.util.List;
import javafx.geometry.HPos;

public class RoomCleaningService {
  public List<String> streets;

  public RoomCleaningService() {
    this.streets = null;
  }

  public boolean areConditionsMet() {
    House house = null;
    Street street = null;
    Room room = null;
    if (house.getHasPermitToBeCleaned() && street.getStreetOpen()
        && (room.getTheDoorOpen())) {
      return true;
    }
    return false;
  }

  public void clean() {
    List<Street> streets = new ArrayList<>();
    List<House> houses = new ArrayList<>();
    List<Room> rooms = new ArrayList<>();
    for (Street street : streets) {
      for (House house : houses) {
        for (Room room : rooms) {
          if (areConditionsMet()) {
            room.setAreShelvesClean(true);
            room.setAreBooksSorted(true);
            room.setAreCarpetsClean(true);
            room.setAreTablesTidy(true);
            room.setAreWindowsDirty(true);
            room.setAirFresh(true);
          }
        }
      }
    }
  }

    public void fuckShitUp() {
      List<Street> streets = new ArrayList<>();
      List<House> houses = new ArrayList<>();
      List<Room> rooms = new ArrayList<>();
      for (Street street : streets) {
        for (House house : houses) {
          for (Room room : rooms) {
            if (areConditionsMet()) {
              room.setAreShelvesClean(false);
              room.setAreBooksSorted(false);
              room.setAreCarpetsClean(false);
              room.setAreTablesTidy(false);
              room.setAreWindowsDirty(false);
              room.setAirFresh(false);
            }
          }
        }
      }
    }
  }

