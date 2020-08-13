package Pirate;

import java.util.ArrayList;
import java.util.List;

public class Ship {

  private List<Pirate> crew;
  private Pirate captain;

  public Ship() {
    this.crew = new ArrayList<>();
  }

  public void addCrewMember() {
    crew.add(new Pirate());
  }

  public void fillShip() {
    this.captain = new Pirate();
    int crewSize = (int) (Math.random() * 50 + 1);
    for (int i = 0; i < (crewSize); i++) {
      addCrewMember();
    }
  }

  public void getShipStatus() {
    if (!captain.isIntoxicated() && captain.isAlive()) {
      System.out.println(
          "is alive and sober, had " + captain.getIntoxicationLevel() + " drinks so far\n" +
              "and the crew size is " + this.getCrew().size());
    }
  }

  public boolean battle (Ship anotherShip){
    this.fillShip();
    anotherShip.fillShip();
    if ((this.getCrew().size()-captain.getIntoxicationLevel()) > (anotherShip.getCrew().size()-anotherShip.captain.getIntoxicationLevel())) {
      anotherShip.crew.remove(1);
      return true;
    }
    return false;
  }


  public List<Pirate> getCrew() {
    return crew;
  }
}
