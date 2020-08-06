package Carrier;

public abstract class Aircraft {
  private int ammo;
  private int maxAmmo;
  private int damage;

  public Aircraft() {
    ammo = 0;
  }

//  public int dogFight() {
//    return ammo * damage;
//    useAllAmmo();
//  }

  public int fight() {
    int damageDealt = ammo * damage;
    setAmmo(0);
    return damageDealt;
  }

  public int getAmmo() {
    return ammo;
  }


  public int refill(int allTheAmmoOnTheCarrier) {
    int neededAmmo = maxAmmo - ammo;
    allTheAmmoOnTheCarrier = allTheAmmoOnTheCarrier - neededAmmo;
    ammo = maxAmmo;
    return allTheAmmoOnTheCarrier;
  }

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

//  public boolean isPriority() {
//    return getType().equals("F35");
//  }

  public abstract boolean isPriority();

  public int getDamage() {
    return damage;
  }

  public void setAmmo(int ammo) {
    this.ammo = ammo;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }
}
