package Carrier;

import java.util.ArrayList;
import java.util.List;

public class MyMain {

  public static void main(String[] args) {
    List<Aircraft> aircrafts = new ArrayList<>();
    Carrier aircraftCarrier = new Carrier(100, 10050);
    Carrier anotherAircraftCarrier = new Carrier(515, 20000);
    F16 f1601 = new F16();
    F16 f1602 = new F16();
    F16 f1603 = new F16();
    F35 f3501 = new F35();
    F35 f3502 = new F35();
    F35 f3503 = new F35();

    aircraftCarrier.addAircraft(f1601);
    aircraftCarrier.addAircraft(f1602);
    aircraftCarrier.addAircraft(f1603);
    aircraftCarrier.addAircraft(f3501);
    aircraftCarrier.addAircraft(f3502);
    aircraftCarrier.addAircraft(f3503);
    System.out.println(aircraftCarrier.storedAmmoOnCarrier);

    f1601.getStatus();
    f1602.getStatus();
    f1603.getStatus();
    f3501.getStatus();
    f3502.getStatus();
    f3503.getStatus();


    System.out.println(aircraftCarrier.storedAmmoOnCarrier);
    aircraftCarrier.fill();
    f1601.getStatus();
    f1602.getStatus();
    f1603.getStatus();
    f3501.getStatus();
    f3502.getStatus();
    f3503.getStatus();
    System.out.println(aircraftCarrier.storedAmmoOnCarrier);
    aircraftCarrier.getCarrierStatus();
//    anotherAircraftCarrier

    anotherAircraftCarrier.getCarrierStatus();
    aircraftCarrier.fight(anotherAircraftCarrier);
    aircraftCarrier.getCarrierStatus();
    anotherAircraftCarrier.getCarrierStatus();

//    System.out.println(aircraft.getType());
//    aircraft.getStatus();
//    aircraft.refill(500);
//    aircraft.getStatus();
  }
}
