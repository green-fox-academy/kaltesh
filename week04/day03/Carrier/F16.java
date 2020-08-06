package Carrier;

public class F16 extends Aircraft {
  public F16() {
    super();
    super.setDamage(30);
    super.setMaxAmmo(8);
  }

  @Override
  public boolean isPriority() {
    return false;
  }
}