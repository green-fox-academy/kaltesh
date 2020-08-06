package Carrier;

public class F35 extends Aircraft {
  public F35() {
    super();
    super.setDamage(50);
    super.setMaxAmmo(12);
  }

  @Override
  public boolean isPriority() {
    return true;
  }
}
