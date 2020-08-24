package roomcleaningservice;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Street> streets = new ArrayList<>();
    List<House> houses = new ArrayList<>();
    List<Room> rooms = new ArrayList<>();
    Room room1 = new Room("livingroom");
    Room room2 = new Room("attic");
    House house1 = new House("Mike", false);
    House house2 = new House("Geri", true);
    Street street = new Street("lincoln", true);
    streets.add(street);
    houses.add(house1);
    houses.add(house2);
    rooms.add(room1);
    rooms.add(room2);
    RoomCleaningService cleaner = new RoomCleaningService();
//    cleaner.clean();
    cleaner.fuckShitUp();
  }
}
