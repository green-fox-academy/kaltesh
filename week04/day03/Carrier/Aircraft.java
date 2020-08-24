package Carrier;

public abstract class Aircraft {
  private int ammo;
  private int maxAmmo;
  private int damage;

  public Aircraft() {

    ammo = 0;
  }

  public int fight() {
    int damageDealt = ammo * damage;
    setAmmo(0);
    return damageDealt;
  }

  public int getAmmo() {
    return ammo;
  }

  public int refill(int ammoAvailableOnCarrier) {
    int ammoAfterOneFill = ammoAvailableOnCarrier - (maxAmmo - ammo);
    ammo = maxAmmo;
    return ammoAfterOneFill;
  }

//  public int refill(int ammoAvailableOnCarrier) {
//    int ammoWeNeed = maxAmmo - ammo;
//    if (ammoAvailableOnCarrier >= ammoWeNeed) {
//      ammo = maxAmmo;
//      ammoAvailableOnCarrier -= ammoWeNeed;
//    } else {
//      ammo = ammoAvailableOnCarrier;
//      ammoAvailableOnCarrier = 0;
//    }
//    return ammoAvailableOnCarrier;
//  }

  public String getType() {
    return getClass().getSimpleName();
  }

  public void getStatus() {
    System.out.println(
        "Type: " + getType() + ", Ammo: " + ammo + ", Base Damage: " + damage + ", All damage: " +
            ammo * damage);
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public abstract boolean isPriority();

  public int getDamage() {
    return damage;
  }

  public int setAmmo(int ammo) {
    this.ammo = ammo;
    return ammo;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }
}
