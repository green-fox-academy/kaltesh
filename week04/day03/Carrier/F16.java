package Carrier;

public class F16 extends Aircraft {
  public F16() {
    super();
    setDamage(30);
    setMaxAmmo(8);
  }

  @Override
  public boolean isPriority() {
    return false;
  }
}