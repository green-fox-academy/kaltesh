package Carrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
  List<Aircraft> aircrafts;
  int storedAmmoOnCarrier;
  int healthPointsACarrier;

  public Carrier(int storedAmmoOnCarrier, int healthPointsACarrier) {
    this.aircrafts = new ArrayList<>();
    this.storedAmmoOnCarrier = storedAmmoOnCarrier;
    this.healthPointsACarrier = healthPointsACarrier;
  }

  public void addAircraft(Aircraft aircraft) {
    this.aircrafts.add(aircraft);
  }

  public void setHealthPointsACarrier(int healthPointsACarrier) {
    this.healthPointsACarrier = healthPointsACarrier;
  }

//  public void fill() {
//    int allNeededAmmo = 0;
//    for (Aircraft aircraft : aircrafts) {
//      allNeededAmmo =+ (aircraft.getMaxAmmo() - aircraft.getAmmo());
//    }
//    if ((allNeededAmmo > storedAmmoOnCarrier) && is
//    {}
//  }
}

//  fill
//  It should fill all the aircraft with ammo and subtract the needed ammo from the ammo storage
//  If there is not enough ammo then it should start to fill the aircrafts with priority first
//  If there is no ammo when this method is called, it should throw an exception


//  Create a class that represents an aircraft-carrier
//
//  The carrier should be able to store aircrafts
//  Each carrier should have a store of ammo represented as number
//  The initial ammo should be given by a parameter in its constructor
//  The carrier also has a health point given in its constructor as well
//      Methods
//  add
//  It should take a new aircraft and add it to its storage
//      fill
//  It should fill all the aircraft with ammo and subtract the needed ammo from the ammo storage
//  If there is not enough ammo then it should start to fill the aircrafts with priority first



