package Carrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
  List<Aircraft> aircrafts;
  int storedAmmoOnCarrier;
  int healthPointsOfACarrier;

  public Carrier(int storedAmmoOnCarrier, int healthPointsACarrier) {
    this.aircrafts = new ArrayList<>();
    this.storedAmmoOnCarrier = storedAmmoOnCarrier;
    this.healthPointsOfACarrier = healthPointsACarrier;
  }

  public void getCarrierStatus() {
    if (getHealthPointsOfACarrier() <= 0) {
      System.out.println("It's dead Jim!");
    } else {
      System.out.println(
          "HP " + getHealthPointsOfACarrier() + " Aircraft count: " + aircrafts.size() +
              " ammo storage " +
              storedAmmoOnCarrier + "Total damage: " + getTotalDamage());
    }
  }

  public void addAircraft(Aircraft aircraft) {
    aircrafts.add(aircraft);
  }

  public void setHealthPointsOfACarrier(int healthPointsOfACarrier) {
    this.healthPointsOfACarrier = healthPointsOfACarrier;
  }

  public void fill() {
    int allTheNeededAmmo = 0;
    for (Aircraft aircraft : aircrafts) {
      allTheNeededAmmo += (aircraft.getMaxAmmo() - aircraft.getAmmo());
    }
    if (allTheNeededAmmo > storedAmmoOnCarrier) {
      fillPriorityAircraft();
      fillNonPriorityAircraft();
    } else {
      for (Aircraft aircraft : aircrafts) {
        storedAmmoOnCarrier = aircraft.refill(storedAmmoOnCarrier);
      }
    }
  }

  private void fillPriorityAircraft() {
    for (Aircraft aircraft : aircrafts) {
      if ((aircraft.isPriority()) &&
          (aircraft.getMaxAmmo() - aircraft.getAmmo()) < storedAmmoOnCarrier) {
        storedAmmoOnCarrier = aircraft.refill(storedAmmoOnCarrier);
      } else {
        storedAmmoOnCarrier -= aircraft.setAmmo(storedAmmoOnCarrier);
      }
    }
  }

  private void fillNonPriorityAircraft() {
    for (Aircraft aircraft : aircrafts) {
      if ((aircraft.getMaxAmmo() - aircraft.getAmmo()) < storedAmmoOnCarrier) {
        storedAmmoOnCarrier = aircraft.refill(storedAmmoOnCarrier);
      } else {
        storedAmmoOnCarrier -= aircraft.setAmmo(storedAmmoOnCarrier);
      }
    }
  }

  public int getTotalDamage() {
    int totalDamage = 0;
    for (Aircraft aircraft : aircrafts) {
      totalDamage += aircraft.getDamage() * aircraft.getAmmo();
    }
    return totalDamage;
  }

  public int getHealthPointsOfACarrier() {
    return healthPointsOfACarrier;
  }

  public void fight(Carrier otherCarrier) {
    int carrierHealthPointsAfterFight =
        otherCarrier.getHealthPointsOfACarrier() - getTotalDamage();
    otherCarrier.setHealthPointsOfACarrier(carrierHealthPointsAfterFight);
  }
}